package com.github.pradyothadavi.api.ai.model;

import com.fasterxml.jackson.annotation.*;

/**
 * Created by pradyot.ha on 19/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
                @JsonSubTypes.Type(value = TextResponse.class),
                @JsonSubTypes.Type(value = ImageResponse.class),
                @JsonSubTypes.Type(value = CardMessage.class),
                @JsonSubTypes.Type(value = CustomPayload.class)
})
public abstract class ResponseMessage {

  @JsonProperty("type")
  int type;
  
  public ResponseMessage(int type) {
    this.type = type;
  }
  
  @JsonIgnore
  public int getType() {
    return type;
  }
  
  public void setType(int type) {
    this.type = type;
  }
}
