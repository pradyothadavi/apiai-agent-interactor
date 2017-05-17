package com.github.pradyothadavi.model;

/**
 * Created by pradyot.ha on 12/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @see <b>https://docs.api.ai/docs/concept-contexts#input-contexts</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Context {
  
  /**
   * Optional
   * Context name.
   */
  @JsonProperty("name")
  private String name;
  
  /**
   * Optional
   * Object consisting of "parameter_name":"parameter_value" pairs
   */
  @JsonProperty("parameters")
  private Map<String,Object> parameters;
  
  /**
   * Optional
   * Number of requests after which the context will expire.
   */
  @JsonProperty("lifespan")
  private Integer lifespan;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Map<String, Object> getParameters() {
    return parameters;
  }
  
  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }
  
  public Integer getLifespan() {
    return lifespan;
  }
  
  public void setLifespan(Integer lifespan) {
    this.lifespan = lifespan;
  }
  
  @Override
  public String toString() {
    return "Context{" + "name='" + name + '\'' + ", parameters=" + parameters + ", lifespan=" + lifespan + '}';
  }
}
