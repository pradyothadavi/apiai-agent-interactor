package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest#Input</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Input {
  
  @JsonProperty("rawInputs")
  private List<RawInput> rawInputs;
  
  @JsonProperty("intent")
  private String intent;
  
  @JsonProperty("arguments")
  private List<Argument> arguments;
  
  public List<RawInput> getRawInputs() {
    return rawInputs;
  }
  
  public void setRawInputs(List<RawInput> rawInputs) {
    this.rawInputs = rawInputs;
  }
  
  public String getIntent() {
    return intent;
  }
  
  public void setIntent(String intent) {
    this.intent = intent;
  }
  
  public List<Argument> getArguments() {
    return arguments;
  }
  
  public void setArguments(List<Argument> arguments) {
    this.arguments = arguments;
  }
  
  @Override
  public String toString() {
    return "Input{" + "rawInputs=" + rawInputs + ", intent='" + intent + '\'' + ", arguments=" + arguments + '}';
  }
}
