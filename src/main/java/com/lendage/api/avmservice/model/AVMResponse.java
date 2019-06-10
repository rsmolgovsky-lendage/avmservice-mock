package com.lendage.api.avmservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.lendage.api.avmservice.model.Address;
import com.lendage.api.avmservice.model.ReportDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AVMResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-12T19:14:53.960-07:00[America/Los_Angeles]")

public class AVMResponse   {
  @JsonProperty("additional_data")
  @Valid
  private Map<String, String> additionalData = null;

  @JsonProperty("confidence_score")
  private String confidenceScore;

  @JsonProperty("error_message")
  private String errorMessage;

  @JsonProperty("property_high")
  private String propertyHigh;

  @JsonProperty("property_low")
  private String propertyLow;

  @JsonProperty("property_value")
  private String propertyValue;

  @JsonProperty("report_details")
  private ReportDetails reportDetails = null;

  @JsonProperty("reported_address")
  private Address reportedAddress = null;

  public AVMResponse additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public AVMResponse putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

  /**
   * Get additionalData
   * @return additionalData
  */
  @ApiModelProperty(value = "")


  public Map<String, String> getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }

  public AVMResponse confidenceScore(String confidenceScore) {
    this.confidenceScore = confidenceScore;
    return this;
  }

  /**
   * Get confidenceScore
   * @return confidenceScore
  */
  @ApiModelProperty(value = "")


  public String getConfidenceScore() {
    return confidenceScore;
  }

  public void setConfidenceScore(String confidenceScore) {
    this.confidenceScore = confidenceScore;
  }

  public AVMResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  */
  @ApiModelProperty(value = "")


  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public AVMResponse propertyHigh(String propertyHigh) {
    this.propertyHigh = propertyHigh;
    return this;
  }

  /**
   * Get propertyHigh
   * @return propertyHigh
  */
  @ApiModelProperty(value = "")


  public String getPropertyHigh() {
    return propertyHigh;
  }

  public void setPropertyHigh(String propertyHigh) {
    this.propertyHigh = propertyHigh;
  }

  public AVMResponse propertyLow(String propertyLow) {
    this.propertyLow = propertyLow;
    return this;
  }

  /**
   * Get propertyLow
   * @return propertyLow
  */
  @ApiModelProperty(value = "")


  public String getPropertyLow() {
    return propertyLow;
  }

  public void setPropertyLow(String propertyLow) {
    this.propertyLow = propertyLow;
  }

  public AVMResponse propertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
    return this;
  }

  /**
   * Get propertyValue
   * @return propertyValue
  */
  @ApiModelProperty(value = "")


  public String getPropertyValue() {
    return propertyValue;
  }

  public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
  }

  public AVMResponse reportDetails(ReportDetails reportDetails) {
    this.reportDetails = reportDetails;
    return this;
  }

  /**
   * Get reportDetails
   * @return reportDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDetails getReportDetails() {
    return reportDetails;
  }

  public void setReportDetails(ReportDetails reportDetails) {
    this.reportDetails = reportDetails;
  }

  public AVMResponse reportedAddress(Address reportedAddress) {
    this.reportedAddress = reportedAddress;
    return this;
  }

  /**
   * Get reportedAddress
   * @return reportedAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address getReportedAddress() {
    return reportedAddress;
  }

  public void setReportedAddress(Address reportedAddress) {
    this.reportedAddress = reportedAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AVMResponse avMResponse = (AVMResponse) o;
    return Objects.equals(this.additionalData, avMResponse.additionalData) &&
        Objects.equals(this.confidenceScore, avMResponse.confidenceScore) &&
        Objects.equals(this.errorMessage, avMResponse.errorMessage) &&
        Objects.equals(this.propertyHigh, avMResponse.propertyHigh) &&
        Objects.equals(this.propertyLow, avMResponse.propertyLow) &&
        Objects.equals(this.propertyValue, avMResponse.propertyValue) &&
        Objects.equals(this.reportDetails, avMResponse.reportDetails) &&
        Objects.equals(this.reportedAddress, avMResponse.reportedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, confidenceScore, errorMessage, propertyHigh, propertyLow, propertyValue, reportDetails, reportedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AVMResponse {\n");
    
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    confidenceScore: ").append(toIndentedString(confidenceScore)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    propertyHigh: ").append(toIndentedString(propertyHigh)).append("\n");
    sb.append("    propertyLow: ").append(toIndentedString(propertyLow)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
    sb.append("    reportDetails: ").append(toIndentedString(reportDetails)).append("\n");
    sb.append("    reportedAddress: ").append(toIndentedString(reportedAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

