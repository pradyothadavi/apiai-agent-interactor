package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest#Argument</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Argument {
  
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("rawText")
  private String rawText;
  
  @JsonProperty("boolValue")
  private boolean boolValue;
  
  @JsonProperty("textValue")
  private String textValue;
  
  @JsonProperty("datetimeValue")
  private DateTime dateTime;
  
  @JsonProperty("extension")
  private Object extension;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getRawText() {
    return rawText;
  }
  
  public void setRawText(String rawText) {
    this.rawText = rawText;
  }
  
  public boolean isBoolValue() {
    return boolValue;
  }
  
  public void setBoolValue(boolean boolValue) {
    this.boolValue = boolValue;
  }
  
  public String getTextValue() {
    return textValue;
  }
  
  public void setTextValue(String textValue) {
    this.textValue = textValue;
  }
  
  @JsonIgnore
  public DateTime getDateTime() {
    return dateTime;
  }
  
  public void setDateTime(DateTime dateTime) {
    this.dateTime = dateTime;
  }
  
  public Object getExtension() {
    return extension;
  }
  
  public void setExtension(Object extension) {
    this.extension = extension;
  }
  
  @Override
  public String toString() {
    return "Argument{" + "name='" + name + '\'' + ", rawText='" + rawText + '\'' + ", boolValue=" + boolValue + ", textValue='" + textValue + '\'' + ", dateTime=" + dateTime + ", extension=" + extension + '}';
  }
}
