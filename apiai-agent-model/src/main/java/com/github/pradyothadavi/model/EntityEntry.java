package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by pradyot.ha on 12/05/17.
 */

/**
 * @see <b>https://docs.api.ai/docs/entities#entity-object</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityEntry {
  
  @JsonProperty("value")
  private String value;
  
  @JsonProperty("synonyms")
  private List<String> synonyms;
  
  @JsonProperty("isEnum")
  private Boolean isEnum;
  
  @JsonProperty("automatedExpansion")
  private Boolean automatedExpansion;
  
  public String getValue() {
    return value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
  
  public List<String> getSynonyms() {
    return synonyms;
  }
  
  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }
  
  public Boolean getEnum() {
    return isEnum;
  }
  
  public void setEnum(Boolean anEnum) {
    isEnum = anEnum;
  }
  
  public Boolean getAutomatedExpansion() {
    return automatedExpansion;
  }
  
  public void setAutomatedExpansion(Boolean automatedExpansion) {
    this.automatedExpansion = automatedExpansion;
  }
  
  @Override
  public String toString() {
    return "EntityEntry{" + "value='" + value + '\'' + ", synonyms=" + synonyms + ", isEnum=" + isEnum + ", automatedExpansion=" + automatedExpansion + '}';
  }
}
