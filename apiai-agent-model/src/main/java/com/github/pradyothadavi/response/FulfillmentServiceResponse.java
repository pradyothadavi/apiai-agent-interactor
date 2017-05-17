package com.github.pradyothadavi.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.model.Context;

import java.util.List;

/**
 * Created by pradyot.ha on 16/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FulfillmentServiceResponse {
  
  @JsonProperty("speech")
  private String speech;
  
  @JsonProperty("displayText")
  private String displayText;
  
  @JsonProperty("data")
  private Object data;
  
  @JsonProperty("contextOut")
  private List<Context> contexts;
  
  @JsonProperty("source")
  private String source;
  
  @JsonProperty("followupEvent")
  private Object followupEvent;
  
  public String getSpeech() {
    return speech;
  }
  
  public void setSpeech(String speech) {
    this.speech = speech;
  }
  
  public String getDisplayText() {
    return displayText;
  }
  
  public void setDisplayText(String displayText) {
    this.displayText = displayText;
  }
  
  public Object getData() {
    return data;
  }
  
  public void setData(Object data) {
    this.data = data;
  }
  
  @JsonIgnore
  public List<Context> getContexts() {
    return contexts;
  }
  
  public void setContexts(List<Context> contexts) {
    this.contexts = contexts;
  }
  
  public String getSource() {
    return source;
  }
  
  public void setSource(String source) {
    this.source = source;
  }
  
  public Object getFollowupEvent() {
    return followupEvent;
  }
  
  public void setFollowupEvent(Object followupEvent) {
    this.followupEvent = followupEvent;
  }
  
  @Override
  public String toString() {
    return "FulfillmentServiceResponse{" + "speech='" + speech + '\'' + ", displayText='" + displayText + '\'' + ", data=" + data + ", contexts=" + contexts + ", source='" + source + '\'' + ", followupEvent=" + followupEvent + '}';
  }
}
