package com.github.pradyothadavi.api.ai.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 12/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Metadata {

  @JsonProperty("intentId")
  private String intentId;
  
  @JsonProperty("webhookUsed")
  private String webhookUsed;
  
  @JsonProperty("webhookForSlotFillingUsed")
  private String webhookForSlotFillingUsed;
  
  @JsonProperty("intentName")
  private String intentName;
  
  public String getIntentId() {
    return intentId;
  }
  
  public void setIntentId(String intentId) {
    this.intentId = intentId;
  }
  
  public String getWebhookUsed() {
    return webhookUsed;
  }
  
  public void setWebhookUsed(String webhookUsed) {
    this.webhookUsed = webhookUsed;
  }
  
  public String getWebhookForSlotFillingUsed() {
    return webhookForSlotFillingUsed;
  }
  
  public void setWebhookForSlotFillingUsed(String webhookForSlotFillingUsed) {
    this.webhookForSlotFillingUsed = webhookForSlotFillingUsed;
  }
  
  public String getIntentName() {
    return intentName;
  }
  
  public void setIntentName(String intentName) {
    this.intentName = intentName;
  }
  
  @Override
  public String toString() {
    return "Metadata{" + "intentId='" + intentId + '\'' + ", webhookUsed='" + webhookUsed + '\'' + ", webhookForSlotFillingUsed='" + webhookForSlotFillingUsed + '\'' + ", intentName='" + intentName + '\'' + '}';
  }
}
