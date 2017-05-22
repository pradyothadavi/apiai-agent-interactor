package com.github.pradyothadavi.google.action.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.google.action.model.CustomPushMessage;
import com.github.pradyothadavi.google.action.model.ExpectedInput;
import com.github.pradyothadavi.google.action.model.FinalResponse;
import com.github.pradyothadavi.google.action.model.ResponseMetaData;

import java.util.List;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppResponse {
  
  @JsonProperty("conversationToken")
  private String conversationToken;
  
  @JsonProperty("expectUserResponse")
  private boolean expectUserResponse;
  
  @JsonProperty("expectedInputs")
  private List<ExpectedInput> expectedInputs;
  
  @JsonProperty("finalResponse")
  private FinalResponse finalResponse;
  
  @JsonProperty("customPushMessage")
  private CustomPushMessage customPushMessage;
  
  @JsonProperty("responseMetadata")
  private ResponseMetaData responseMetadata;
  
  public String getConversationToken() {
    return conversationToken;
  }
  
  public void setConversationToken(String conversationToken) {
    this.conversationToken = conversationToken;
  }
  
  public boolean isExpectUserResponse() {
    return expectUserResponse;
  }
  
  public void setExpectUserResponse(boolean expectUserResponse) {
    this.expectUserResponse = expectUserResponse;
  }
  
  public List<ExpectedInput> getExpectedInputs() {
    return expectedInputs;
  }
  
  public void setExpectedInputs(List<ExpectedInput> expectedInputs) {
    this.expectedInputs = expectedInputs;
  }
  
  public FinalResponse getFinalResponse() {
    return finalResponse;
  }
  
  public void setFinalResponse(FinalResponse finalResponse) {
    this.finalResponse = finalResponse;
  }
  
  public CustomPushMessage getCustomPushMessage() {
    return customPushMessage;
  }
  
  public void setCustomPushMessage(CustomPushMessage customPushMessage) {
    this.customPushMessage = customPushMessage;
  }
  
  public ResponseMetaData getResponseMetadata() {
    return responseMetadata;
  }
  
  public void setResponseMetadata(ResponseMetaData responseMetadata) {
    this.responseMetadata = responseMetadata;
  }
  
  @Override
  public String toString() {
    return "AppResponse{" + "conversationToken='" + conversationToken + '\'' + ", expectUserResponse=" + expectUserResponse + ", expectedInputs=" + expectedInputs + ", finalResponse=" + finalResponse + ", customPushMessage=" + customPushMessage + ", responseMetadata=" + responseMetadata + '}';
  }
}
