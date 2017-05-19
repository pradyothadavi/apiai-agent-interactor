package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

/**
 * Created by pradyot.ha on 12/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Fulfillment {
  
  @JsonProperty("speech")
  private String speech;
  
  @JsonProperty("messages")
  private List<ResponseMessage> responseMessages;
  
  public String getSpeech() {
    return speech;
  }
  
  public void setSpeech(String speech) {
    this.speech = speech;
  }
  
  @JsonIgnore
  public List<ResponseMessage> getResponseMessages() {
    return responseMessages;
  }
  
  public void setResponseMessages(List<ResponseMessage> responseMessages) {
    this.responseMessages = responseMessages;
  }
  
  @Override
  public String toString() {
    return "Fulfillment{" + "speech='" + speech + '\'' + ", responseMessages=" + responseMessages + '}';
  }
}
