package com.github.pradyothadavi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 19/05/17.
 */
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
