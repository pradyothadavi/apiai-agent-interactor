package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#InputPrompt</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InputPrompt {

  @JsonProperty("richInitialPrompt")
  private RichResponse richInitialPrompt;
  
  public RichResponse getRichInitialPrompt() {
    return richInitialPrompt;
  }
  
  public void setRichInitialPrompt(RichResponse richInitialPrompt) {
    this.richInitialPrompt = richInitialPrompt;
  }
  
  @Override
  public String toString() {
    return "InputPrompt{" + "richInitialPrompt=" + richInitialPrompt + '}';
  }
}
