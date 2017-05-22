package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#ReturnInfo</b>
 */
public class ReturnInfo {
  
  @JsonProperty("reason")
  private String reason;
  
  public String getReason() {
    return reason;
  }
  
  public void setReason(String reason) {
    this.reason = reason;
  }
  
  @Override
  public String toString() {
    return "ReturnInfo{" + "reason='" + reason + '\'' + '}';
  }
}
