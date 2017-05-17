package com.github.pradyothadavi.core;

/**
 * Created by pradyot.ha on 12/05/17.
 */

/**
 * @see "https://docs.api.ai/docs/authentication"
 */
public class AgentApiKey {
  
  private String clientAccessToken;
  
  private String developerAccessToken;
  
  public String getClientAccessToken() {
    return clientAccessToken;
  }
  
  public void setClientAccessToken(String clientAccessToken) {
    this.clientAccessToken = clientAccessToken;
  }
  
  public String getDeveloperAccessToken() {
    return developerAccessToken;
  }
  
  public void setDeveloperAccessToken(String developerAccessToken) {
    this.developerAccessToken = developerAccessToken;
  }
  
  @Override
  public String toString() {
    return "AgentApiKey{" + "clientAccessToken='" + clientAccessToken + '\'' + ", developerAccessToken='" + developerAccessToken + '\'' + '}';
  }
}
