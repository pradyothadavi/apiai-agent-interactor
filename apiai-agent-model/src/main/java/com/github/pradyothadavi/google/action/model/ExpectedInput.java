package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#ExpectedInput</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExpectedInput {

  @JsonProperty("inputPrompt")
  private InputPrompt inputPrompt;
  
  @JsonProperty("possibleIntents")
  private List<ExpectedIntent> possibleIntents;
  
  @JsonProperty("speechBiasingHints")
  private String speechBiasingHints;
  
  public InputPrompt getInputPrompt() {
    return inputPrompt;
  }
  
  public void setInputPrompt(InputPrompt inputPrompt) {
    this.inputPrompt = inputPrompt;
  }
  
  public List<ExpectedIntent> getPossibleIntents() {
    return possibleIntents;
  }
  
  public void setPossibleIntents(List<ExpectedIntent> possibleIntents) {
    this.possibleIntents = possibleIntents;
  }
  
  public String getSpeechBiasingHints() {
    return speechBiasingHints;
  }
  
  public void setSpeechBiasingHints(String speechBiasingHints) {
    this.speechBiasingHints = speechBiasingHints;
  }
  
  @Override
  public String toString() {
    return "ExpectedInput{" + "inputPrompt=" + inputPrompt + ", possibleIntents=" + possibleIntents + ", speechBiasingHints='" + speechBiasingHints + '\'' + '}';
  }
}
