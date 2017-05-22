package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeOfDay {
  
  @JsonProperty("hours")
  private int hours;
  
  @JsonProperty("minutes")
  private int minutes;
  
  @JsonProperty("seconds")
  private int seconds;
  
  @JsonProperty("nanos")
  private int nanos;
  
  public int getHours() {
    return hours;
  }
  
  public void setHours(int hours) {
    this.hours = hours;
  }
  
  public int getMinutes() {
    return minutes;
  }
  
  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }
  
  public int getSeconds() {
    return seconds;
  }
  
  public void setSeconds(int seconds) {
    this.seconds = seconds;
  }
  
  public int getNanos() {
    return nanos;
  }
  
  public void setNanos(int nanos) {
    this.nanos = nanos;
  }
  
  @Override
  public String toString() {
    return "TimeOfDay{" + "hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + ", nanos=" + nanos + '}';
  }
}
