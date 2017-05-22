package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/Location</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Location {
  
  @JsonProperty("coordinates")
  private LatLng latLng;
  
  @JsonProperty("formattedAddress")
  private String formattedAddress;
  
  @JsonProperty("zipCode")
  private String zipCode;
  
  @JsonProperty("city")
  private String city;
  
  @JsonProperty("postalAddress")
  private PostalAddress postalAddress;
  
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("phoneNumber")
  private String phoneNumber;
  
  @JsonProperty("notes")
  private String notes;
  
  @JsonIgnore
  public LatLng getLatLng() {
    return latLng;
  }
  
  public void setLatLng(LatLng latLng) {
    this.latLng = latLng;
  }
  
  public String getFormattedAddress() {
    return formattedAddress;
  }
  
  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }
  
  public String getZipCode() {
    return zipCode;
  }
  
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
  
  public String getCity() {
    return city;
  }
  
  public void setCity(String city) {
    this.city = city;
  }
  
  public PostalAddress getPostalAddress() {
    return postalAddress;
  }
  
  public void setPostalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getPhoneNumber() {
    return phoneNumber;
  }
  
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  public String getNotes() {
    return notes;
  }
  
  public void setNotes(String notes) {
    this.notes = notes;
  }
  
  @Override
  public String toString() {
    return "Location{" + "latLng=" + latLng + ", formattedAddress='" + formattedAddress + '\'' + ", zipCode='" + zipCode + '\'' + ", city='" + city + '\'' + ", postalAddress=" + postalAddress + ", name='" + name + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", notes='" + notes + '\'' + '}';
  }
}
