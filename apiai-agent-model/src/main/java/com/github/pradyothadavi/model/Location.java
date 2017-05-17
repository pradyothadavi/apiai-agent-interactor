package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 12/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Location {
  
  @JsonProperty("latitude")
  private Integer latitude;
  
  @JsonProperty("longitude")
  private Integer longitude;
  
  public Integer getLatitude() {
    return latitude;
  }
  
  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }
  
  public Integer getLongitude() {
    return longitude;
  }
  
  public void setLongitude(Integer longitude) {
    this.longitude = longitude;
  }
  
  @Override
  public String toString() {
    return "Location{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
  }
}
