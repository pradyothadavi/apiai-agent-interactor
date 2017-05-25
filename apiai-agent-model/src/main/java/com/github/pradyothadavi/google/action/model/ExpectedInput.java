package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
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
  
  public static ExpectedInputBuilder builder(){
    return new ExpectedInputBuilder();
  }
  @Override
  public String toString() {
    return "ExpectedInput{" + "inputPrompt=" + inputPrompt + ", possibleIntents=" + possibleIntents + ", speechBiasingHints='" + speechBiasingHints + '\'' + '}';
  }
  
  public static class ExpectedInputBuilder{
  
    private InputPrompt inputPrompt;
    private List<ExpectedIntent> possibleIntents;
    private String speechBiasingHints;
  
    public ExpectedInputBuilder inputPrompt(InputPrompt inputPrompt) {
      this.inputPrompt = inputPrompt;
      return this;
    }
  
    public ExpectedInputBuilder possibleIntent(ExpectedIntent possibleIntent) {
      if(null == this.possibleIntents)
        this.possibleIntents = new ArrayList<ExpectedIntent>();
      this.possibleIntents.add(possibleIntent);
      return this;
    }
    
    public ExpectedInputBuilder possibleIntents(List<ExpectedIntent> possibleIntents) {
      if(null == this.possibleIntents)
        this.possibleIntents = new ArrayList<ExpectedIntent>();
      this.possibleIntents.addAll(possibleIntents);
      return this;
    }
  
    public ExpectedInputBuilder setSpeechBiasingHints(String speechBiasingHints) {
      this.speechBiasingHints = speechBiasingHints;
      return this;
    }
    
    public ExpectedInput build(){
      ExpectedInput expectedInput = new ExpectedInput();
      expectedInput.setInputPrompt(inputPrompt);
      expectedInput.setPossibleIntents(possibleIntents);
      expectedInput.setSpeechBiasingHints(speechBiasingHints);
      return expectedInput;
    }
    
  }
}
