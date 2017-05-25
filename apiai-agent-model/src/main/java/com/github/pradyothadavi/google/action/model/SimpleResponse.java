package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#SimpleResponse</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimpleResponse {
  
  @JsonProperty("textToSpeech")
  private String textToSpeech;
  
  @JsonProperty("ssml")
  private String ssml;
  
  @JsonProperty("displayText")
  private String displayText;
  
  public static SimpleResponseBuilder builder(){
    return new SimpleResponseBuilder();
  }
  
  public String getTextToSpeech() {
    return textToSpeech;
  }
  
  public void setTextToSpeech(String textToSpeech) {
    this.textToSpeech = textToSpeech;
  }
  
  public String getSsml() {
    return ssml;
  }
  
  public void setSsml(String ssml) {
    this.ssml = ssml;
  }
  
  public String getDisplayText() {
    return displayText;
  }
  
  public void setDisplayText(String displayText) {
    this.displayText = displayText;
  }
  
  @Override
  public String toString() {
    return "SimpleResponse{" + "textToSpeech='" + textToSpeech + '\'' + ", ssml='" + ssml + '\'' + ", displayText='" + displayText + '\'' + '}';
  }
  
  public static class SimpleResponseBuilder{
    
    private String textToSpeech;
    private String ssml;
    private String displayText;
  
    public SimpleResponseBuilder textToSpeech(String textToSpeech) {
      this.textToSpeech = textToSpeech;
      return this;
    }
  
    public SimpleResponseBuilder ssml(String ssml) {
      this.ssml = ssml;
      return this;
    }
  
    public SimpleResponseBuilder displayText(String displayText) {
      this.displayText = displayText;
      return this;
    }
    
    public SimpleResponse build(){
      SimpleResponse simpleResponse = new SimpleResponse();
      simpleResponse.setTextToSpeech(textToSpeech);
      simpleResponse.setSsml(ssml);
      simpleResponse.setDisplayText(displayText);
      return simpleResponse;
    }
  }
}
