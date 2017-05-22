package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.google.action.enums.ConversationType;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest#Conversation</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Conversation {
  
  @JsonProperty("conversationId")
  private String conversationId;
  
  @JsonProperty("type")
  private ConversationType conversationType;
  
  @JsonProperty("conversationToken")
  private String conversationToken;
  
  public String getConversationId() {
    return conversationId;
  }
  
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }
  
  @JsonIgnore
  public ConversationType getConversationType() {
    return conversationType;
  }
  
  public void setConversationType(ConversationType conversationType) {
    this.conversationType = conversationType;
  }
  
  public String getConversationToken() {
    return conversationToken;
  }
  
  public void setConversationToken(String conversationToken) {
    this.conversationToken = conversationToken;
  }
}
