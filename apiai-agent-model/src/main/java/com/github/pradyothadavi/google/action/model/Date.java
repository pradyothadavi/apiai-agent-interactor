package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest#Date</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Date {
  
  @JsonProperty("year")
  private int year;
  
  @JsonProperty("month")
  private int month;
  
  @JsonProperty("day")
  private int day;
  
  public int getYear() {
    return year;
  }
  
  public void setYear(int year) {
    this.year = year;
  }
  
  public int getMonth() {
    return month;
  }
  
  public void setMonth(int month) {
    this.month = month;
  }
  
  public int getDay() {
    return day;
  }
  
  public void setDay(int day) {
    this.day = day;
  }
  
  @Override
  public String toString() {
    return "Date{" + "year=" + year + ", month=" + month + ", day=" + day + '}';
  }
}
