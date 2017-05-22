package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#OrderUpdate</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderUpdate {

  @JsonProperty("orderState")
  private OrderState orderState;
  
  @JsonProperty("orderManagementActions")
  private List<Action> actions;
  
  @JsonProperty("updateTime")
  private String updateTime;
  
  @JsonProperty("totalPrice")
  private Price price;
  
  // TODO : lineItemUpdates
  
  @JsonProperty("userNotification")
  private UserNotification userNotification;
  
  @JsonProperty("googleOrderId")
  private String googleOrderId;
  
  @JsonProperty("actionOrderId")
  private String actionOrderId;
  
  @JsonProperty("rejectionInfo")
  private RejectionInfo rejectionInfo;
  
  @JsonProperty("receipt")
  private Receipt receipt;
  
  @JsonProperty("cancellationInfo")
  private CancellationInfo cancellationInfo;
  
  @JsonProperty("inTransitInfo")
  private InTransitInfo inTransitInfo;
  
  @JsonProperty("fulfillmentInfo")
  private FulfillmentInfo fulfillmentInfo;
  
  @JsonProperty("returnInfo")
  private ReturnInfo returnInfo;
  
  public OrderState getOrderState() {
    return orderState;
  }
  
  public void setOrderState(OrderState orderState) {
    this.orderState = orderState;
  }
  
  @JsonIgnore
  public List<Action> getActions() {
    return actions;
  }
  
  public void setActions(List<Action> actions) {
    this.actions = actions;
  }
  
  public String getUpdateTime() {
    return updateTime;
  }
  
  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }
  
  public Price getPrice() {
    return price;
  }
  
  public void setPrice(Price price) {
    this.price = price;
  }
  
  public UserNotification getUserNotification() {
    return userNotification;
  }
  
  public void setUserNotification(UserNotification userNotification) {
    this.userNotification = userNotification;
  }
  
  public String getGoogleOrderId() {
    return googleOrderId;
  }
  
  public void setGoogleOrderId(String googleOrderId) {
    this.googleOrderId = googleOrderId;
  }
  
  public String getActionOrderId() {
    return actionOrderId;
  }
  
  public void setActionOrderId(String actionOrderId) {
    this.actionOrderId = actionOrderId;
  }
  
  public RejectionInfo getRejectionInfo() {
    return rejectionInfo;
  }
  
  public void setRejectionInfo(RejectionInfo rejectionInfo) {
    this.rejectionInfo = rejectionInfo;
  }
  
  public Receipt getReceipt() {
    return receipt;
  }
  
  public void setReceipt(Receipt receipt) {
    this.receipt = receipt;
  }
  
  public CancellationInfo getCancellationInfo() {
    return cancellationInfo;
  }
  
  public void setCancellationInfo(CancellationInfo cancellationInfo) {
    this.cancellationInfo = cancellationInfo;
  }
  
  public InTransitInfo getInTransitInfo() {
    return inTransitInfo;
  }
  
  public void setInTransitInfo(InTransitInfo inTransitInfo) {
    this.inTransitInfo = inTransitInfo;
  }
  
  public FulfillmentInfo getFulfillmentInfo() {
    return fulfillmentInfo;
  }
  
  public void setFulfillmentInfo(FulfillmentInfo fulfillmentInfo) {
    this.fulfillmentInfo = fulfillmentInfo;
  }
  
  public ReturnInfo getReturnInfo() {
    return returnInfo;
  }
  
  public void setReturnInfo(ReturnInfo returnInfo) {
    this.returnInfo = returnInfo;
  }
}
