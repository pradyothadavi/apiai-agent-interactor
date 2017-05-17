package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Created by pradyot.ha on 12/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
  
  @JsonProperty("source")
  private String source;
  
  @JsonProperty("resolvedQuery")
  private String resolvedQuery;
  
  @JsonProperty("action")
  private String action;
  
  @JsonProperty("actionIncomplete")
  private Boolean actionIncomplete;
  
  @JsonProperty("parameters")
  private Map<String,Object> parameters;
  
  @JsonProperty("contexts")
  private List<Context> contexts;
  
  @JsonProperty("fulfillment")
  private Fulfillment fulfillment;
  
  @JsonProperty("score")
  private Integer score;
  
  @JsonProperty("metadata")
  private Metadata metadata;
  
  public String getSource() {
    return source;
  }
  
  public void setSource(String source) {
    this.source = source;
  }
  
  public String getResolvedQuery() {
    return resolvedQuery;
  }
  
  public void setResolvedQuery(String resolvedQuery) {
    this.resolvedQuery = resolvedQuery;
  }
  
  public String getAction() {
    return action;
  }
  
  public void setAction(String action) {
    this.action = action;
  }
  
  public Boolean getActionIncomplete() {
    return actionIncomplete;
  }
  
  public void setActionIncomplete(Boolean actionIncomplete) {
    this.actionIncomplete = actionIncomplete;
  }
  
  public Map<String, Object> getParameters() {
    return parameters;
  }
  
  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }
  
  public List<Context> getContexts() {
    return contexts;
  }
  
  public void setContexts(List<Context> contexts) {
    this.contexts = contexts;
  }
  
  public Fulfillment getFulfillment() {
    return fulfillment;
  }
  
  public void setFulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }
  
  public Integer getScore() {
    return score;
  }
  
  public void setScore(Integer score) {
    this.score = score;
  }
  
  public Metadata getMetadata() {
    return metadata;
  }
  
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }
  
  @Override
  public String toString() {
    return "Result{" + "source='" + source + '\'' + ", resolvedQuery='" + resolvedQuery + '\'' + ", action='" + action + '\'' + ", actionIncomplete=" + actionIncomplete + ", parameters=" + parameters + ", contexts=" + contexts + ", fulfillment=" + fulfillment + ", score=" + score + ", metadata=" + metadata + '}';
  }
}
