package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 19/05/17.
 */
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
