package com.github.pradyothadavi.google.action.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by pradyot.ha on 22/05/17.
 */

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppResponse#BasicCard</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicCard {

  @JsonProperty("title")
  private String title;
  
  @JsonProperty("subtitle")
  private String subtitle;
  
  @JsonProperty("formattedText")
  private String formattedText;
  
  @JsonProperty("image")
  private Image image;
  
  @JsonProperty("buttons")
  private List<Button> buttons;
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getSubtitle() {
    return subtitle;
  }
  
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }
  
  public String getFormattedText() {
    return formattedText;
  }
  
  public void setFormattedText(String formattedText) {
    this.formattedText = formattedText;
  }
  
  public Image getImage() {
    return image;
  }
  
  public void setImage(Image image) {
    this.image = image;
  }
  
  public List<Button> getButtons() {
    return buttons;
  }
  
  public void setButtons(List<Button> buttons) {
    this.buttons = buttons;
  }
  
  @Override
  public String toString() {
    return "BasicCard{" + "title='" + title + '\'' + ", subtitle='" + subtitle + '\'' + ", formattedText='" + formattedText + '\'' + ", image=" + image + ", buttons=" + buttons + '}';
  }
}
