package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/Image</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Image {

  @JsonProperty("url")
  private String url;
  
  @JsonProperty("accessibilityText")
  private String accessibilityText;
  
  @JsonProperty("height")
  private int height;
  
  @JsonProperty("width")
  private int width;
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public String getAccessibilityText() {
    return accessibilityText;
  }
  
  public void setAccessibilityText(String accessibilityText) {
    this.accessibilityText = accessibilityText;
  }
  
  public int getHeight() {
    return height;
  }
  
  public void setHeight(int height) {
    this.height = height;
  }
  
  public int getWidth() {
    return width;
  }
  
  public void setWidth(int width) {
    this.width = width;
  }
  
  @Override
  public String toString() {
    return "Image{" + "url='" + url + '\'' + ", accessibilityText='" + accessibilityText + '\'' + ", height=" + height + ", width=" + width + '}';
  }
}
