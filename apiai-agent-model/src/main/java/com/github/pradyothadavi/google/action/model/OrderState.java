package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/OrderState</b>
 */
public class OrderState {
  
  @JsonProperty("state")
  private String state;
  
  @JsonProperty("label")
  private String label;
  
  public String getState() {
    return state;
  }
  
  public void setState(String state) {
    this.state = state;
  }
  
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }
  
  @Override
  public String toString() {
    return "OrderState{" + "state='" + state + '\'' + ", label='" + label + '\'' + '}';
  }
}
