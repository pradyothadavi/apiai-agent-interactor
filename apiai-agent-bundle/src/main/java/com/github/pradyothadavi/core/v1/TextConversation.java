package com.github.pradyothadavi.core.v1;

import com.github.pradyothadavi.core.AiAgentConfiguration;
import com.github.pradyothadavi.core.AiConversationService;
import com.github.pradyothadavi.request.QueryRequest;
import com.github.pradyothadavi.response.QueryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;

/**
 * Created by pradyot.ha on 12/05/17.
 */
public class TextConversation implements AiConversationService {
  
  private static final Logger logger = LoggerFactory.getLogger(TextConversation.class);
  
  private AiAgentConfiguration aiAgentConfiguration;
  private Client client;
  private WebTarget webTarget;
  
  @Inject
  public TextConversation(AiAgentConfiguration aiAgentConfiguration) {
    this.aiAgentConfiguration = aiAgentConfiguration;
    this.client = ClientBuilder.newClient();
    this.webTarget = this.client.target(aiAgentConfiguration.getNluPlatformUrl());
  }
  
  public QueryResponse processConversation(QueryRequest queryRequest) {
    
    logger.info("QueryRequest : {}",queryRequest);
    QueryResponse queryResponse = null;
    queryRequest.setLanguageTag(aiAgentConfiguration.getSupportedLanguage().getLanguageTag());
  
    String path = aiAgentConfiguration.getQueryUrl();
    MultivaluedHashMap<String,Object> headers = new MultivaluedHashMap<String, Object>();
    headers.add("Authorization","Bearer "+aiAgentConfiguration.getClientAccessToken());
  
    Response response = null;
    try {
      logger.info("Path : {}",path);
      response = webTarget.path(path).request(MediaType.APPLICATION_JSON).headers(headers).post(Entity.entity(queryRequest,MediaType.APPLICATION_JSON));
      logger.info("Response : {}",response);
      if(Response.Status.OK.getStatusCode() == response.getStatus())
      {
        queryResponse = response.readEntity(QueryResponse.class);
      }
    }catch (Exception e){
      logger.error("Exception : {}",e);
    }finally {
      if(null != response)
        response.close();
    }
    logger.info("QueryResponse : {}",queryResponse);
    return queryResponse;
  }
}
