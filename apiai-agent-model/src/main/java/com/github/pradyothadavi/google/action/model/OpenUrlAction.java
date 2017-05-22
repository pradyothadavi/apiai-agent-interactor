package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#OpenUrlAction</b>
 */
@JsonIgnoreProperties(ignoreUnknown =  true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenUrlAction {
  
  @JsonProperty("url")
  private String url;
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  @Override
  public String toString() {
    return "OpenUrlAction{" + "url='" + url + '\'' + '}';
  }
}
