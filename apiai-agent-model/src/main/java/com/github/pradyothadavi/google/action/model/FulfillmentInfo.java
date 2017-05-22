package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#FulfillmentInfo</b>
 */
public class FulfillmentInfo {
  
  @JsonProperty("deliveryTime")
  private String deliveryTime;
  
  public String getDeliveryTime() {
    return deliveryTime;
  }
  
  public void setDeliveryTime(String deliveryTime) {
    this.deliveryTime = deliveryTime;
  }
  
  @Override
  public String toString() {
    return "FulfillmentInfo{" + "deliveryTime='" + deliveryTime + '\'' + '}';
  }
}
