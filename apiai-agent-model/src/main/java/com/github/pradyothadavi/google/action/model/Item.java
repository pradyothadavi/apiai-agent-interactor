package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#Item</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {
  
  @JsonProperty("simpleResponse")
  private SimpleResponse simpleResponse;
  
  @JsonProperty("basicCard")
  private BasicCard basicCard;
  
  @JsonProperty("structuredResponse")
  private StructuredResponse structuredResponse;
  
  public SimpleResponse getSimpleResponse() {
    return simpleResponse;
  }
  
  public void setSimpleResponse(SimpleResponse simpleResponse) {
    this.simpleResponse = simpleResponse;
  }
  
  public BasicCard getBasicCard() {
    return basicCard;
  }
  
  public void setBasicCard(BasicCard basicCard) {
    this.basicCard = basicCard;
  }
  
  public StructuredResponse getStructuredResponse() {
    return structuredResponse;
  }
  
  public void setStructuredResponse(StructuredResponse structuredResponse) {
    this.structuredResponse = structuredResponse;
  }
  
  @Override
  public String toString() {
    return "Item{" + "simpleResponse=" + simpleResponse + ", basicCard=" + basicCard + ", structuredResponse=" + structuredResponse + '}';
  }
}
