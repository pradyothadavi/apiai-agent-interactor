package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#RichResponse</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RichResponse {
  
  @JsonProperty("items")
  private List<Item> items;
  
  @JsonProperty("suggestions")
  private List<Suggestion> suggestions;
  
  @JsonProperty("linkOutSuggestion")
  private LinkOutSuggestion linkOutSuggestion;
  
  public List<Item> getItems() {
    return items;
  }
  
  public void setItems(List<Item> items) {
    this.items = items;
  }
  
  public List<Suggestion> getSuggestions() {
    return suggestions;
  }
  
  public void setSuggestions(List<Suggestion> suggestions) {
    this.suggestions = suggestions;
  }
  
  public LinkOutSuggestion getLinkOutSuggestion() {
    return linkOutSuggestion;
  }
  
  public void setLinkOutSuggestion(LinkOutSuggestion linkOutSuggestion) {
    this.linkOutSuggestion = linkOutSuggestion;
  }
  
  public static RichResponseBuilder builder(){
    return new RichResponseBuilder();
  }
  
  @Override
  public String toString() {
    return "RichResponse{" + "items=" + items + ", suggestions=" + suggestions + ", linkOutSuggestion=" + linkOutSuggestion + '}';
  }
  
  public static class RichResponseBuilder{
    
    private List<Item> items;
    private List<Suggestion> suggestions;
    private LinkOutSuggestion linkOutSuggestion;
  
    public RichResponseBuilder item(Item item) {
      if(null == this.items)
        this.items = new ArrayList<Item>();
      this.items.add(item);
      return this;
    }
    
    public RichResponseBuilder items(List<Item> items) {
      if(null == this.items)
        this.items = new ArrayList<Item>();
      this.items.addAll(items);
      return this;
    }
  
    public RichResponseBuilder suggestion(Suggestion suggestion) {
      if(null == this.suggestions)
        this.suggestions = new ArrayList<Suggestion>();
      this.suggestions.add(suggestion);
      return this;
    }
    
    public RichResponseBuilder suggestions(List<Suggestion> suggestions) {
      if(null == this.suggestions)
        this.suggestions = new ArrayList<Suggestion>();
      this.suggestions.addAll(suggestions);
      return this;
    }
    
    public RichResponseBuilder linkOutSuggestion(LinkOutSuggestion linkOutSuggestion) {
      this.linkOutSuggestion = linkOutSuggestion;
      return this;
    }
    
    public RichResponse build(){
      RichResponse richResponse = new RichResponse();
      richResponse.setItems(items);
      richResponse.setSuggestions(suggestions);
      richResponse.setLinkOutSuggestion(linkOutSuggestion);
      return richResponse;
    }
  }
}
