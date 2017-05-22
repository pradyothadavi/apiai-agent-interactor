package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#StructuredResponse</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StructuredResponse {
  
  @JsonProperty("orderUpdate")
  private OrderUpdate orderUpdate;
  
  public OrderUpdate getOrderUpdate() {
    return orderUpdate;
  }
  
  public void setOrderUpdate(OrderUpdate orderUpdate) {
    this.orderUpdate = orderUpdate;
  }
  
  @Override
  public String toString() {
    return "StructuredResponse{" + "orderUpdate=" + orderUpdate + '}';
  }
}
