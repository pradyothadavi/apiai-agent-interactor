package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.google.action.enums.PriceType;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/Price</b>
 */
public class Price {
  
  @JsonProperty("type")
  private PriceType priceType;
  
  @JsonProperty("amount")
  private Money money;
  
  public PriceType getPriceType() {
    return priceType;
  }
  
  public void setPriceType(PriceType priceType) {
    this.priceType = priceType;
  }
  
  public Money getMoney() {
    return money;
  }
  
  public void setMoney(Money money) {
    this.money = money;
  }
  
  @Override
  public String toString() {
    return "Price{" + "priceType=" + priceType + ", money=" + money + '}';
  }
}
