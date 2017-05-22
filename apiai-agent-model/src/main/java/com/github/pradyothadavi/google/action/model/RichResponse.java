package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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
  
  @Override
  public String toString() {
    return "RichResponse{" + "items=" + items + ", suggestions=" + suggestions + ", linkOutSuggestion=" + linkOutSuggestion + '}';
  }
}
