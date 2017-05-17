package com.github.pradyothadavi;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.Configuration;
import io.dropwizard.ConfiguredBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by pradyot.ha on 12/05/17.
 */
public abstract class ApiAiAgentInteractorBundle<T extends Configuration> implements ConfiguredBundle<T> {
  
  public void run(final T configuration,final Environment environment) throws Exception {
    
    ApiAiAgentInteractorConfiguration apiAiAgentInteractorConfiguration = getApiAiAgentInteractorConfiguration(configuration);
    if(null == apiAiAgentInteractorConfiguration)
    {
      throw new IllegalStateException("ApiAiAgentInteractorConfiguration is missing.");
    }
    validateConfiguration(apiAiAgentInteractorConfiguration);
    Injector injector = Guice.createInjector(new ApiAiAgentInteractorModule(apiAiAgentInteractorConfiguration));
  }
  
  private void validateConfiguration(ApiAiAgentInteractorConfiguration apiAiAgentInteractorConfiguration) {
    String clientAccessToken = apiAiAgentInteractorConfiguration.getAiAgentConfiguration().getClientAccessToken();
    if(StringUtils.isEmpty(clientAccessToken))
      throw new IllegalArgumentException("ClientAccessToken is missing.");
  }
  
  public void initialize(Bootstrap<?> bootstrap) {
  
  }
  
  protected abstract ApiAiAgentInteractorConfiguration getApiAiAgentInteractorConfiguration(T configuration);
}
