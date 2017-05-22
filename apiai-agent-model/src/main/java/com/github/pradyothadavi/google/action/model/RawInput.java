package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.google.action.enums.InputType;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest#RawInput</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RawInput {
  
  @JsonProperty("createTime")
  private String createTime;
  
  @JsonProperty("inputType")
  private InputType inputType;
  
  @JsonProperty("query")
  private String query;
  
  public String getCreateTime() {
    return createTime;
  }
  
  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }
  
  public InputType getInputType() {
    return inputType;
  }
  
  public void setInputType(InputType inputType) {
    this.inputType = inputType;
  }
  
  public String getQuery() {
    return query;
  }
  
  public void setQuery(String query) {
    this.query = query;
  }
  
  @Override
  public String toString() {
    return "RawInput{" + "createTime='" + createTime + '\'' + ", inputType=" + inputType + ", query='" + query + '\'' + '}';
  }
}
