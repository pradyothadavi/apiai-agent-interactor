package com.github.pradyothadavi.google.action.model;

/**
 * Created by pradyot.ha on 22/05/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @see <b>https://developers.google.com/actions/reference/rest/Shared.Types/Location#PostalAddress</b>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostalAddress {
  
  @JsonProperty("revision")
  private int revision;
  
  @JsonProperty("regionCode")
  private String regionCode;
  
  @JsonProperty("languageCode")
  private String languageCode;
  
  @JsonProperty("postalCode")
  private String postalCode;
  
  @JsonProperty("sortingCode")
  private String sortingCode;
  
  @JsonProperty("administrativeArea")
  private String administrativeArea;
  
  @JsonProperty("locality")
  private String locality;
  
  @JsonProperty("sublocality")
  private String sublocality;
  
  @JsonProperty("addressLines")
  private List<String> addressLines;
  
  @JsonProperty("recipients")
  private List<String> recipients;
  
  @JsonProperty("organization")
  private String organization;
  
  public int getRevision() {
    return revision;
  }
  
  public void setRevision(int revision) {
    this.revision = revision;
  }
  
  public String getRegionCode() {
    return regionCode;
  }
  
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }
  
  public String getLanguageCode() {
    return languageCode;
  }
  
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }
  
  public String getPostalCode() {
    return postalCode;
  }
  
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
  
  public String getSortingCode() {
    return sortingCode;
  }
  
  public void setSortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
  }
  
  public String getAdministrativeArea() {
    return administrativeArea;
  }
  
  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }
  
  public String getLocality() {
    return locality;
  }
  
  public void setLocality(String locality) {
    this.locality = locality;
  }
  
  public String getSublocality() {
    return sublocality;
  }
  
  public void setSublocality(String sublocality) {
    this.sublocality = sublocality;
  }
  
  public List<String> getAddressLines() {
    return addressLines;
  }
  
  public void setAddressLines(List<String> addressLines) {
    this.addressLines = addressLines;
  }
  
  public List<String> getRecipients() {
    return recipients;
  }
  
  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }
  
  public String getOrganization() {
    return organization;
  }
  
  public void setOrganization(String organization) {
    this.organization = organization;
  }
  
  @Override
  public String toString() {
    return "PostalAddress{" + "revision=" + revision + ", regionCode='" + regionCode + '\'' + ", languageCode='" + languageCode + '\'' + ", postalCode='" + postalCode + '\'' + ", sortingCode='" + sortingCode + '\'' + ", administrativeArea='" + administrativeArea + '\'' + ", locality='" + locality + '\'' + ", sublocality='" + sublocality + '\'' + ", addressLines=" + addressLines + ", recipients=" + recipients + ", organization='" + organization + '\'' + '}';
  }
}
