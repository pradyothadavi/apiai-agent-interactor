package com.github.pradyothadavi.api.ai.model;

/**
 * Created by pradyot.ha on 12/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @see <b>https://docs.api.ai/docs/concept-events</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event {
  
  /**
   * Event name.
   */
  @JsonProperty("name")
  private String name;
  
  /**
   * Object consisting of "parameter_name":"parameter_value" pairs.
   */
  @JsonProperty("data")
  private Map<String,String> data;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Map<String, String> getData() {
    return data;
  }
  
  public void setData(Map<String, String> data) {
    this.data = data;
  }
  
  @Override
  public String toString() {
    return "Event{" + "name='" + name + '\'' + ", data=" + data + '}';
  }
}
