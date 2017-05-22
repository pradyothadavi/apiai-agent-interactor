package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */
public class Receipt {
  
  @JsonProperty("confirmedActionOrderId")
  private String confirmedActionOrderId;
  
  public String getConfirmedActionOrderId() {
    return confirmedActionOrderId;
  }
  
  public void setConfirmedActionOrderId(String confirmedActionOrderId) {
    this.confirmedActionOrderId = confirmedActionOrderId;
  }
  
  @Override
  public String toString() {
    return "Receipt{" + "confirmedActionOrderId='" + confirmedActionOrderId + '\'' + '}';
  }
}
