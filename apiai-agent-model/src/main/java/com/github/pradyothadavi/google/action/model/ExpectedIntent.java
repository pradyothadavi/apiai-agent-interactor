package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#ExpectedIntent</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExpectedIntent {
  
  @JsonProperty("intent")
  private String intent;
  
  @JsonProperty("inputValueData")
  private InputValueData inputValueData;
  
  public String getIntent() {
    return intent;
  }
  
  public void setIntent(String intent) {
    this.intent = intent;
  }
  
  public InputValueData getInputValueData() {
    return inputValueData;
  }
  
  public void setInputValueData(InputValueData inputValueData) {
    this.inputValueData = inputValueData;
  }
  
  @Override
  public String toString() {
    return "ExpectedIntent{" + "intent='" + intent + '\'' + ", inputValueData=" + inputValueData + '}';
  }
}
