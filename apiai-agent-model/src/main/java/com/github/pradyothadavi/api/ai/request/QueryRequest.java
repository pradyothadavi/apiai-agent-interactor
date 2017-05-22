package com.github.pradyothadavi.api.ai.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.api.ai.model.*;

import java.util.List;

/**
 * Created by pradyot.ha on 12/05/17.
 */

/**
 * @see <b>https://docs.api.ai/docs/query#query-parameters-and-json-fields</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRequest {
  
  /**
   * Required, unless event is specified.
   * Natural language text to be processed. Query length should not exceed 256 characters.
   */
  @JsonProperty("query")
  private String query;
  
  /**
   * Required, unless query is specified.
   */
  @JsonProperty("event")
  private Event event;
  
  /**
   * Required
   */
  @JsonProperty("sessionId")
  private String sessionId;
  
  /**
   * Required
   */
  @JsonProperty("lang")
  private String languageTag;
  
  
  /**
   * Optional
   */
  @JsonProperty("contexts")
  private List<Context> contexts;
  
  /**
   * Optional.
   * If true, all current contexts in a session will be reset before the new ones are set. False by default.
   */
  @JsonProperty("resetContexts")
  private Boolean resetContexts;

  /**
   * Optional
   */
  @JsonProperty("entities")
  private List<Entity> entities;

  /**
   * Optional
   */
  @JsonProperty("timezone")
  private String timezone;

  /**
   *
   */
  @JsonProperty("location")
  private Location location;

  /**
   *
   */
  @JsonProperty("originalRequest")
  private OriginalRequest originalRequest;
  
  public QueryRequest() {
  }
  
  public String getQuery() {
    return query;
  }
  
  public void setQuery(String query) {
    this.query = query;
  }
  
  public Event getEvent() {
    return event;
  }
  
  public void setEvent(Event event) {
    this.event = event;
  }
  
  public String getSessionId() {
    return sessionId;
  }
  
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }
  
  @JsonIgnore
  public String getLanguageTag() {
    return languageTag;
  }
  
  public void setLanguageTag(String languageTag) {
    this.languageTag = languageTag;
  }
  
  public List<Context> getContexts() {
    return contexts;
  }
  
  public void setContexts(List<Context> contexts) {
    this.contexts = contexts;
  }
  
  public Boolean getResetContexts() {
    return resetContexts;
  }

  public void setResetContexts(Boolean resetContexts) {
    this.resetContexts = resetContexts;
  }

  public List<Entity> getEntities() {
    return entities;
  }

  public void setEntities(List<Entity> entities) {
    this.entities = entities;
  }

  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public OriginalRequest getOriginalRequest() {
    return originalRequest;
  }

  public void setOriginalRequest(OriginalRequest originalRequest) {
    this.originalRequest = originalRequest;
  }
  
  @Override
  public String toString() {
    return "QueryRequest{" + "query=" + query + ", event=" + event + ", sessionId='" + sessionId + '\'' + ", languageTag='" + languageTag + '\'' + ", contexts=" + contexts + ", resetContexts=" + resetContexts + ", entities=" + entities + ", timezone='" + timezone + '\'' + ", location=" + location + ", originalRequest=" + originalRequest + '}';
  }
}
