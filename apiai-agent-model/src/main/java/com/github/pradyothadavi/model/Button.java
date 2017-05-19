package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 19/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Button {
  
  @JsonProperty("text")
  private String text;
  
  @JsonProperty("postback")
  private String postback;
  
  public String getText() {
    return text;
  }
  
  public void setText(String text) {
    this.text = text;
  }
  
  public String getPostback() {
    return postback;
  }
  
  public void setPostback(String postback) {
    this.postback = postback;
  }
  
  @Override
  public String toString() {
    return "Button{" + "text='" + text + '\'' + ", postback='" + postback + '\'' + '}';
  }
}
