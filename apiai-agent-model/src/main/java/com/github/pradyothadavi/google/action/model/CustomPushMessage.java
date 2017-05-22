package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#CustomPushMessage</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomPushMessage {
  
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
    return "CustomPushMessage{" + "orderUpdate=" + orderUpdate + '}';
  }
}
