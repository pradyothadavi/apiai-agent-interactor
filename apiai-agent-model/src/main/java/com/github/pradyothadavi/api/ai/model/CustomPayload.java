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
public class CustomPayload extends ResponseMessage {
  
  @JsonProperty("payload")
  private Object payload;
  
  public CustomPayload() {
    super(ResponseObjectType.CUSTOM_PAYLOAD.type);
  }
  
  @JsonIgnore
  public Object getPayload() {
    return payload;
  }
  
  public void setPayload(Object payload) {
    this.payload = payload;
  }
  
  @Override
  public String toString() {
    return "CustomPayload{" + "type=" + type + ", payload=" + payload + '}';
  }
}
