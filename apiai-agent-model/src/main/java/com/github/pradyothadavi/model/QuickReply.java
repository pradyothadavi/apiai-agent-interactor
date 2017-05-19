package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by pradyot.ha on 19/05/17.
 */
public class QuickReply extends ResponseMessage {
  
  @JsonProperty("title")
  private String title;
  
  @JsonProperty("replies")
  private List<String> replies;
  
  public QuickReply() {
    super(ResponseObjectType.QUICK_REPLY.type);
  }
  
  @JsonIgnore
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  @JsonIgnore
  public List<String> getReplies() {
    return replies;
  }
  
  public void setReplies(List<String> replies) {
    this.replies = replies;
  }
  
  @Override
  public String toString() {
    return "QuickReply{" + "type=" + type + ", title='" + title + '\'' + '}';
  }
}
