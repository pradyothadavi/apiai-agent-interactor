package com.github.pradyothadavi.api.ai.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/06/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AmountUnit {
  
  @JsonProperty("unit")
  private String unit;
  
  @JsonProperty("amount")
  private Double amount;
  
  @JsonIgnore
  public String getUnit() {
    return unit;
  }
  
  public void setUnit(String unit) {
    this.unit = unit;
  }
  
  @JsonIgnore
  public Double getAmount() {
    return amount;
  }
  
  public void setAmount(Double amount) {
    this.amount = amount;
  }
  
  @Override
  public String toString() {
    return "AmountUnit{" + "unit='" + unit + '\'' + ", amount=" + amount + '}';
  }
}
