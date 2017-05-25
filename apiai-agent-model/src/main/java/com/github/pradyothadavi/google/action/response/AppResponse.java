package com.github.pradyothadavi.google.action.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.google.action.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppResponse {
  
  @JsonProperty("conversationToken")
  private String conversationToken;
  
  @JsonProperty("expectUserResponse")
  private boolean expectUserResponse;
  
  @JsonProperty("expectedInputs")
  private List<ExpectedInput> expectedInputs;
  
  @JsonProperty("finalResponse")
  private FinalResponse finalResponse;
  
  @JsonProperty("customPushMessage")
  private CustomPushMessage customPushMessage;
  
  @JsonProperty("responseMetadata")
  private ResponseMetaData responseMetadata;
  
  public static AppResponseBuilder builder(){
    return new AppResponseBuilder();
  }
  
  public String getConversationToken() {
    return conversationToken;
  }
  
  public void setConversationToken(String conversationToken) {
    this.conversationToken = conversationToken;
  }
  
  public boolean isExpectUserResponse() {
    return expectUserResponse;
  }
  
  public void setExpectUserResponse(boolean expectUserResponse) {
    this.expectUserResponse = expectUserResponse;
  }
  
  public List<ExpectedInput> getExpectedInputs() {
    return expectedInputs;
  }
  
  public void setExpectedInputs(List<ExpectedInput> expectedInputs) {
    this.expectedInputs = expectedInputs;
  }
  
  public FinalResponse getFinalResponse() {
    return finalResponse;
  }
  
  public void setFinalResponse(FinalResponse finalResponse) {
    this.finalResponse = finalResponse;
  }
  
  public CustomPushMessage getCustomPushMessage() {
    return customPushMessage;
  }
  
  public void setCustomPushMessage(CustomPushMessage customPushMessage) {
    this.customPushMessage = customPushMessage;
  }
  
  public ResponseMetaData getResponseMetadata() {
    return responseMetadata;
  }
  
  public void setResponseMetadata(ResponseMetaData responseMetadata) {
    this.responseMetadata = responseMetadata;
  }
  
  @Override
  public String toString() {
    return "AppResponse{" + "conversationToken='" + conversationToken + '\'' + ", expectUserResponse=" + expectUserResponse + ", expectedInputs=" + expectedInputs + ", finalResponse=" + finalResponse + ", customPushMessage=" + customPushMessage + ", responseMetadata=" + responseMetadata + '}';
  }
  
  public static class AppResponseBuilder {
    
    private String conversationToken;
    private boolean expectUserResponse;
    private List<ExpectedInput> expectedInputs;
    private FinalResponse finalResponse;
    private CustomPushMessage customPushMessage;
    private ResponseMetaData responseMetadata;
  
    public AppResponseBuilder conversationId(String conversationId){
      this.conversationToken = conversationId;
      return this;
    }
  
    public AppResponseBuilder expectUserResponse(boolean expectUserResponse){
      this.expectUserResponse = expectUserResponse;
      return this;
    }
    
    public AppResponseBuilder expectedInput(ExpectedInput expectedInput){
      if(null == this.expectedInputs)
        this.expectedInputs = new ArrayList<ExpectedInput>();
      this.expectedInputs.add(expectedInput);
      return this;
    }
  
    public AppResponseBuilder expectedInputs(List<ExpectedInput> expectedInputs){
      if(null == this.expectedInputs)
        this.expectedInputs = new ArrayList<ExpectedInput>();
      this.expectedInputs.addAll(expectedInputs);
      return this;
    }
  
    public AppResponseBuilder finalResponse(FinalResponse finalResponse){
      this.finalResponse = finalResponse;
      return this;
    }
  
    public AppResponseBuilder customPushMessage(CustomPushMessage customPushMessage){
      this.customPushMessage = customPushMessage;
      return this;
    }
  
    public AppResponseBuilder responseMetadata(ResponseMetaData responseMetadata){
      this.responseMetadata = responseMetadata;
      return this;
    }
    
    public AppResponse build(){
      AppResponse appResponse = new AppResponse();
      appResponse.setConversationToken(this.conversationToken);
      appResponse.setExpectUserResponse(this.expectUserResponse);
      appResponse.setExpectedInputs(this.expectedInputs);
      appResponse.setFinalResponse(this.finalResponse);
      appResponse.setCustomPushMessage(this.customPushMessage);
      appResponse.setResponseMetadata(this.responseMetadata);
      return appResponse;
    }
  }
}
