package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by pradyot.ha on 19/05/17.
 */
public class CardMessage extends ResponseMessage{
  
  @JsonProperty("title")
  private String title;
  
  @JsonProperty("subtitle")
  private String subtitle;
  
  @JsonProperty("buttons")
  private List<Button> buttons;
  
  public CardMessage() {
    super(ResponseObjectType.CARD.type);
  }
  
  @JsonIgnore
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  @JsonIgnore
  public String getSubtitle() {
    return subtitle;
  }
  
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }
  
  @JsonIgnore
  public List<Button> getButtons() {
    return buttons;
  }
  
  public void setButtons(List<Button> buttons) {
    this.buttons = buttons;
  }
  
  @Override
  public String toString() {
    return "CardMessage{" + "type=" + type + ", title='" + title + '\'' + ", subtitle='" + subtitle + '\'' + ", buttons=" + buttons + '}';
  }
}
