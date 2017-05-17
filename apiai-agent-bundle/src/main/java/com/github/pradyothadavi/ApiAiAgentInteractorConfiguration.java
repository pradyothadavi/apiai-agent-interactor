package com.github.pradyothadavi;

import com.github.pradyothadavi.core.AiAgentConfiguration;

/**
 * Created by pradyot.ha on 12/05/17.
 */
public class ApiAiAgentInteractorConfiguration {
  
  private AiAgentConfiguration aiAgentConfiguration;
  
  public AiAgentConfiguration getAiAgentConfiguration() {
    return aiAgentConfiguration;
  }
  
  public void setAiAgentConfiguration(AiAgentConfiguration aiAgentConfiguration) {
    this.aiAgentConfiguration = aiAgentConfiguration;
  }
  
  @Override
  public String toString() {
    return "ApiAiAgentInteractorConfiguration{" + "aiAgentConfiguration=" + aiAgentConfiguration + '}';
  }
}
