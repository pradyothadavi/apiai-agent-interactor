package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/Location#LatLng</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LatLng {
  
  @JsonProperty("latitude")
  private int latitude;
  
  @JsonProperty("longitude")
  private int longitude;
  
  public int getLatitude() {
    return latitude;
  }
  
  public void setLatitude(int latitude) {
    this.latitude = latitude;
  }
  
  public int getLongitude() {
    return longitude;
  }
  
  public void setLongitude(int longitude) {
    this.longitude = longitude;
  }
  
  @Override
  public String toString() {
    return "LatLng{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
  }
}
