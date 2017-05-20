package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 12/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Fulfillment {
  
  @JsonProperty("speech")
  private String speech;
  
  @JsonProperty("messages")
  private String responseMessages;
  
  public String getSpeech() {
    return speech;
  }
  
  public void setSpeech(String speech) {
    this.speech = speech;
  }
  
  @JsonIgnore
  public String getResponseMessages() {
    return responseMessages;
  }
  
  public void setResponseMessages(String responseMessages) {
    this.responseMessages = responseMessages;
  }
  
  @Override
  public String toString() {
    return "Fulfillment{" + "speech='" + speech + '\'' + ", responseMessages=" + responseMessages + '}';
  }
}
