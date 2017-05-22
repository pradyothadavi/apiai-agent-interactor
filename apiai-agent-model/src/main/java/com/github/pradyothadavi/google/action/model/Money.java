package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/Price#Money</b>
 */
public class Money {
  
  @JsonProperty("currencyCode")
  private String currencyCode;
  
  @JsonProperty("units")
  private String units;
  
  @JsonProperty("nanos")
  private int nanos;
  
  public String getCurrencyCode() {
    return currencyCode;
  }
  
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }
  
  public String getUnits() {
    return units;
  }
  
  public void setUnits(String units) {
    this.units = units;
  }
  
  public int getNanos() {
    return nanos;
  }
  
  public void setNanos(int nanos) {
    this.nanos = nanos;
  }
  
  @Override
  public String toString() {
    return "Money{" + "currencyCode='" + currencyCode + '\'' + ", units='" + units + '\'' + ", nanos=" + nanos + '}';
  }
}
