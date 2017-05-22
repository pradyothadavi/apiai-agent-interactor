package com.github.pradyothadavi.google.action.request;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.google.action.model.*;

import java.util.List;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppRequest {
  
  @JsonProperty("user")
  private User user;
  
  @JsonProperty("device")
  private Device device;
  
  @JsonProperty("surface")
  private Surface surface;
  
  @JsonProperty("conversation")
  private Conversation conversation;
  
  @JsonProperty("inputs")
  private List<Input> inputs;
  
  @JsonProperty("isInSandbox")
  private boolean isInSandbox;
  
  public User getUser() {
    return user;
  }
  
  public void setUser(User user) {
    this.user = user;
  }
  
  public Device getDevice() {
    return device;
  }
  
  public void setDevice(Device device) {
    this.device = device;
  }
  
  public Surface getSurface() {
    return surface;
  }
  
  public void setSurface(Surface surface) {
    this.surface = surface;
  }
  
  public Conversation getConversation() {
    return conversation;
  }
  
  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }
  
  public List<Input> getInputs() {
    return inputs;
  }
  
  public void setInputs(List<Input> inputs) {
    this.inputs = inputs;
  }
  
  public boolean isInSandbox() {
    return isInSandbox;
  }
  
  public void setInSandbox(boolean inSandbox) {
    isInSandbox = inSandbox;
  }
  
  @Override
  public String toString() {
    return "AppRequest{" + "user=" + user + ", device=" + device + ", surface=" + surface + ", conversation=" + conversation + ", inputs=" + inputs + ", isInSandbox=" + isInSandbox + '}';
  }
}

