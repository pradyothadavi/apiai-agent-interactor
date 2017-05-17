package com.github.pradyothadavi.core;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by pradyot.ha on 12/05/17.
 */
public class AiAgentConfiguration {
  
  private AgentApiKey agentApiKey;
  
  /**
   * @see "https://docs.api.ai/docs/languages"
   */
  private SupportedLanguage supportedLanguage;
  
  private String nluPlatformUrl;
  
  /**
   * @see "https://docs.api.ai/docs/versioning"
   */
  private String apiVersion;
  
  public AgentApiKey getAgentApiKey() {
    return agentApiKey;
  }
  
  public void setAgentApiKey(AgentApiKey agentApiKey) {
    this.agentApiKey = agentApiKey;
  }
  
  public String getApiVersion() {
    return apiVersion;
  }
  
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }
  
  public SupportedLanguage getSupportedLanguage() {
    return supportedLanguage;
  }
  
  public void setSupportedLanguage(SupportedLanguage supportedLanguage) {
    this.supportedLanguage = null != supportedLanguage ? supportedLanguage : SupportedLanguage.getDefaultLanguage();
  }
  
  public String getNluPlatformUrl() {
    return nluPlatformUrl;
  }
  
  public void setNluPlatformUrl(String nluPlatformUrl) {
    this.nluPlatformUrl = nluPlatformUrl;
  }
  
  public String getClientAccessToken(){
    return agentApiKey.getClientAccessToken();
  }
  
  public String getDeveloperAccessToken(){
    return agentApiKey.getDeveloperAccessToken();
  }
  
  public String getQueryUrl(){
    try {
      return URLEncoder.encode(String.format("%s?v=%s", EndPoint.QUERY, apiVersion),"UTF-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  @Override
  public String toString() {
    return "AiAgentConfiguration{" + "agentApiKey=" + agentApiKey + ", supportedLanguage=" + supportedLanguage + ", nluPlatformUrl='" + nluPlatformUrl + '\'' + ", apiVersion='" + apiVersion + '\'' + '}';
  }
}
