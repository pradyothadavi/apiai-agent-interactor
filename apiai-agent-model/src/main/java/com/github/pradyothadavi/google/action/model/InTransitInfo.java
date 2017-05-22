package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#InTransitInfo</b>
 */
public class InTransitInfo {
  
  @JsonProperty("updatedTime")
  private String updatedTime;
  
  public String getUpdatedTime() {
    return updatedTime;
  }
  
  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }
  
  @Override
  public String toString() {
    return "InTransitInfo{" + "updatedTime='" + updatedTime + '\'' + '}';
  }
}
