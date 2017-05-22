package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.google.action.enums.ActionType;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#Action</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Action {
  
  @JsonProperty("type")
  private ActionType actionType;
  
  @JsonProperty("button")
  private Button button;
  
  @JsonIgnore
  public ActionType getActionType() {
    return actionType;
  }
  
  public void setActionType(ActionType actionType) {
    this.actionType = actionType;
  }
  
  public Button getButton() {
    return button;
  }
  
  public void setButton(Button button) {
    this.button = button;
  }
  
  @Override
  public String toString() {
    return "Action{" + "actionType=" + actionType + ", button=" + button + '}';
  }
}
