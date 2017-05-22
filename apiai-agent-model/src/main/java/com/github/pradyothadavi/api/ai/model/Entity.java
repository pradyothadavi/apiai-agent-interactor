package com.github.pradyothadavi.api.ai.model;

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
public class Entity {
  
  /**
   * A unique identifier for the entity.
   */
  @JsonProperty("id")
  private String id;
  
  /**
   * The name of the entity.
   */
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("entries")
  private List<EntityEntry> entityEntries;
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public List<EntityEntry> getEntityEntries() {
    return entityEntries;
  }
  
  public void setEntityEntries(List<EntityEntry> entityEntries) {
    this.entityEntries = entityEntries;
  }
  
  @Override
  public String toString() {
    return "Entity{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", entityEntries=" + entityEntries + '}';
  }
}
