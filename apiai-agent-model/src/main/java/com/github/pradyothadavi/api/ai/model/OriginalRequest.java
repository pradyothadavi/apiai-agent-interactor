package com.github.pradyothadavi.api.ai.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 12/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OriginalRequest {
  
  @JsonProperty("source")
  private String source;
  
  @JsonProperty("data")
  private Object data;
  
  public String getSource() {
    return source;
  }
  
  public void setSource(String source) {
    this.source = source;
  }
  
  public Object getData() {
    return data;
  }
  
  public void setData(Object data) {
    this.data = data;
  }
  
  @Override
  public String toString() {
    return "OriginalRequest{" + "source='" + source + '\'' + ", data='" + data + '\'' + '}';
  }
}
