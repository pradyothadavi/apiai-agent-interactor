package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pradyothadavi.google.action.enums.Permission;

import java.util.List;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/AppRequest#User</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
  
  /**
   * Unique ID of the user
   */
  @JsonProperty("userId")
  private String userId;
  
  @JsonProperty("profile")
  private UserProfile userProfile;
  
  @JsonProperty("accessToken")
  private String accessToken;
  
  @JsonProperty("permissions")
  private List<Permission> permissions;
  
  public String getUserId() {
    return userId;
  }
  
  public void setUserId(String userId) {
    this.userId = userId;
  }
  
  @JsonIgnore
  public UserProfile getUserProfile() {
    return userProfile;
  }
  
  public void setUserProfile(UserProfile userProfile) {
    this.userProfile = userProfile;
  }
  
  public String getAccessToken() {
    return accessToken;
  }
  
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }
  
  public List<Permission> getPermissions() {
    return permissions;
  }
  
  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }
  
  @Override
  public String toString() {
    return "User{" + "userId='" + userId + '\'' + ", userProfile=" + userProfile + ", accessToken='" + accessToken + '\'' + ", permissions=" + permissions + '}';
  }
}
