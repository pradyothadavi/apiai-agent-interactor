package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest#Device</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Device {
  
  @JsonProperty("location")
  private Location location;
  
  public Location getLocation() {
    return location;
  }
  
  public void setLocation(Location location) {
    this.location = location;
  }
  
  @Override
  public String toString() {
    return "Device{" + "location=" + location + '}';
  }
}
