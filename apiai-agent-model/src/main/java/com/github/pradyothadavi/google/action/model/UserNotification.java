package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#UserNotification</b>
 */
public class UserNotification {

  @JsonProperty("title")
  private String title;
  
  @JsonProperty("text")
  private String text;
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getText() {
    return text;
  }
  
  public void setText(String text) {
    this.text = text;
  }
  
  @Override
  public String toString() {
    return "UserNotification{" + "title='" + title + '\'' + ", text='" + text + '\'' + '}';
  }
}
