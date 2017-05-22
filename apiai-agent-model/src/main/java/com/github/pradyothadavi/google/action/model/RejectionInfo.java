package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.google.action.enums.ReasonType;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#RejectionInfo</b>
 */
public class RejectionInfo {

  @JsonProperty("type")
  private ReasonType reasonType;
  
  @JsonProperty("reason")
  private String reason;
  
  @JsonIgnore
  public ReasonType getReasonType() {
    return reasonType;
  }
  
  public void setReasonType(ReasonType reasonType) {
    this.reasonType = reasonType;
  }
  
  public String getReason() {
    return reason;
  }
  
  public void setReason(String reason) {
    this.reason = reason;
  }
  
  @Override
  public String toString() {
    return "RejectionInfo{" + "reasonType=" + reasonType + ", reason='" + reason + '\'' + '}';
  }
}
