package com.github.pradyothadavi.api.ai.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 19/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextResponse extends ResponseMessage {
  
  @JsonProperty("speech")
  private String speech;
  
  public TextResponse() {
    super(ResponseObjectType.TEXT.type);
  }
  
  @JsonIgnore
  public String getSpeech() {
    return speech;
  }
  
  public void setSpeech(String speech) {
    this.speech = speech;
  }
  
  @Override
  public String toString() {
    return "TextResponse{" + "type=" + type + ", speech='" + speech + '\'' + '}';
  }
}
