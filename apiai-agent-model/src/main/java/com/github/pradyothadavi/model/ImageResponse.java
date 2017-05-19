package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 19/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageResponse extends ResponseMessage {
  
  @JsonProperty("imageUrl")
  private String imageUrl;
  
  public ImageResponse() {
    super(ResponseObjectType.IMAGE.type);
  }
  
  @JsonIgnore
  public String getImageUrl() {
    return imageUrl;
  }
  
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }
  
  @Override
  public String toString() {
    return "ImageResponse{" + "type=" + type + ", imageUrl='" + imageUrl + '\'' + '}';
  }
}
