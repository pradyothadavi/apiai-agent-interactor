package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest#UserProfile</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserProfile {

  @JsonProperty("displayName")
  private String displayName;
  
  @JsonProperty("givenName")
  private String givenName;
  
  @JsonProperty("familyName")
  private String familyName;
  
  @JsonProperty("email")
  private String email;
  
  @JsonProperty("phoneNumber")
  private String phoneNumber;
  
  public String getDisplayName() {
    return displayName;
  }
  
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  
  public String getGivenName() {
    return givenName;
  }
  
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }
  
  public String getFamilyName() {
    return familyName;
  }
  
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getPhoneNumber() {
    return phoneNumber;
  }
  
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  @Override
  public String toString() {
    return "UserProfile{" + "displayName='" + displayName + '\'' + ", givenName='" + givenName + '\'' + ", familyName='" + familyName + '\'' + ", email='" + email + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
  }
}
