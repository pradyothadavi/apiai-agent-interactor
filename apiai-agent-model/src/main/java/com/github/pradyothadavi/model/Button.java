package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 19/05/17.
 */
public class Button {
  
  @JsonProperty("text")
  private String text;
  
  @JsonProperty("postback")
  private String postback;
  
  @Override
  public String toString() {
    return "Button{" + "text='" + text + '\'' + ", postback='" + postback + '\'' + '}';
  }
}
