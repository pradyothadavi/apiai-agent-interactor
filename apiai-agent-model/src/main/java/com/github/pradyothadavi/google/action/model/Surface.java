package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest#Surface</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Surface {
  
  @JsonProperty("capabilities")
  private List<Capability> capabilities;
  
  public List<Capability> getCapabilities() {
    return capabilities;
  }
  
  public void setCapabilities(List<Capability> capabilities) {
    this.capabilities = capabilities;
  }
  
  @Override
  public String toString() {
    return "Surface{" + "capabilities=" + capabilities + '}';
  }
}
