package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest#Capability</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Capability {
  
  @JsonProperty("name")
  private String name;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public String toString() {
    return "Capability{" + "name='" + name + '\'' + '}';
  }
}
