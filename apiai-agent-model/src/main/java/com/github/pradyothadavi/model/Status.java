package com.github.pradyothadavi.model;

/**
 * Created by pradyot.ha on 12/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://docs.api.ai/docs/status-object</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Status {
  
  @JsonProperty("code")
  private Integer code;
  
  @JsonProperty("errorType")
  private String errorType;
  
  @JsonProperty("errorId")
  private String errorId;
  
  @JsonProperty("errorDetails")
  private String errorDetails;
  
  public Integer getCode() {
    return code;
  }
  
  public void setCode(Integer code) {
    this.code = code;
  }
  
  public String getErrorType() {
    return errorType;
  }
  
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }
  
  public String getErrorId() {
    return errorId;
  }
  
  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }
  
  public String getErrorDetails() {
    return errorDetails;
  }
  
  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }
  
  @Override
  public String toString() {
    return "Status{" + "code=" + code + ", errorType='" + errorType + '\'' + ", errorId='" + errorId + '\'' + ", errorDetails='" + errorDetails + '\'' + '}';
  }
}
