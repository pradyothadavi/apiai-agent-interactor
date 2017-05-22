package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#FinalResponse</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinalResponse {

  @JsonProperty("richResponse")
  private RichResponse richResponse;
  
  public RichResponse getRichResponse() {
    return richResponse;
  }
  
  public void setRichResponse(RichResponse richResponse) {
    this.richResponse = richResponse;
  }
  
  @Override
  public String toString() {
    return "FinalResponse{" + "richResponse=" + richResponse + '}';
  }
}
