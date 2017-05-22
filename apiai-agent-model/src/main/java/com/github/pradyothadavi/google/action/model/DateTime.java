package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest#DateTime</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateTime {
  
  @JsonProperty("date")
  private Date date;
  
  @JsonProperty("time")
  private TimeOfDay timeOfDay;
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  @JsonIgnore
  public TimeOfDay getTimeOfDay() {
    return timeOfDay;
  }
  
  public void setTimeOfDay(TimeOfDay timeOfDay) {
    this.timeOfDay = timeOfDay;
  }
  
  @Override
  public String toString() {
    return "DateTime{" + "date=" + date + ", timeOfDay=" + timeOfDay + '}';
  }
}
