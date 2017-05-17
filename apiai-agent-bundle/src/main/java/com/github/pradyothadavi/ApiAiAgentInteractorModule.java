package com.github.pradyothadavi;

import com.github.pradyothadavi.core.AiAgentConfiguration;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

/**
 * Created by pradyot.ha on 12/05/17.
 */
public class ApiAiAgentInteractorModule extends AbstractModule {
  
  private ApiAiAgentInteractorConfiguration apiAiAgentInteractorConfiguration;
  
  public ApiAiAgentInteractorModule(ApiAiAgentInteractorConfiguration apiAiAgentInteractorConfiguration) {
    this.apiAiAgentInteractorConfiguration = apiAiAgentInteractorConfiguration;
  }
  
  protected void configure() {
  
  }
  
  @Provides
  @Singleton
  public AiAgentConfiguration providesAiAgentConfiguration(){
    return apiAiAgentInteractorConfiguration.getAiAgentConfiguration();
  }
}
