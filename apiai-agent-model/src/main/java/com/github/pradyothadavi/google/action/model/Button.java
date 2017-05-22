package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#Button</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Button {
  
  @JsonProperty("title")
  private String title;
  
  @JsonProperty("openUrlAction")
  private OpenUrlAction openUrlAction;
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public OpenUrlAction getOpenUrlAction() {
    return openUrlAction;
  }
  
  public void setOpenUrlAction(OpenUrlAction openUrlAction) {
    this.openUrlAction = openUrlAction;
  }
  
  @Override
  public String toString() {
    return "Button{" + "title='" + title + '\'' + ", openUrlAction=" + openUrlAction + '}';
  }
}
