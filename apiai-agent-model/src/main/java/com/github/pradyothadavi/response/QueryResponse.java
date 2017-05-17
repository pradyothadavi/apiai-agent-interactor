package com.github.pradyothadavi.response;

/**
 * Created by pradyot.ha on 12/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.model.Result;
import com.github.pradyothadavi.model.Status;

import java.util.Date;

/**
 * @see <b>https://docs.api.ai/docs/query#response</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryResponse {
  
  /**
   * 	Unique identifier of the result.
   */
  @JsonProperty("id")
  private String id;
  
  /**
   * Date and time of the request in UTC timezone using ISO-8601 format.
   */
  @JsonProperty("timestamp")
  private Date timestamp;
  
  /**
   * Agent's language.
   */
  @JsonProperty("lang")
  private String languageTag;
  
  @JsonProperty("result")
  private Result result;
  
  @JsonProperty("sessionId")
  private String sessionId;
  
  @JsonProperty("status")
  private Status status;
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public Date getTimestamp() {
    return timestamp;
  }
  
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }
  
  public String getLanguageTag() {
    return languageTag;
  }
  
  public void setLanguageTag(String languageTag) {
    this.languageTag = languageTag;
  }
  
  public Result getResult() {
    return result;
  }
  
  public void setResult(Result result) {
    this.result = result;
  }
  
  public String getSessionId() {
    return sessionId;
  }
  
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }
  
  public Status getStatus() {
    return status;
  }
  
  public void setStatus(Status status) {
    this.status = status;
  }
  
  @Override
  public String toString() {
    return "QueryResponse{" + "id='" + id + '\'' + ", timestamp=" + timestamp + ", languageTag='" + languageTag + '\'' + ", result=" + result + ", sessionId='" + sessionId + '\'' + ", status=" + status + '}';
  }
}
