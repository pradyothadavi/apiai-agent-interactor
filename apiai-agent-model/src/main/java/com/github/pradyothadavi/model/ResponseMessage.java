package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 19/05/17.
 */
public abstract class ResponseMessage {

  @JsonProperty("type")
  int type;
  
  public ResponseMessage(int type) {
    this.type = type;
  }
  
  @JsonIgnore
  public int getType() {
    return type;
  }
  
  public void setType(int type) {
    this.type = type;
  }
}
