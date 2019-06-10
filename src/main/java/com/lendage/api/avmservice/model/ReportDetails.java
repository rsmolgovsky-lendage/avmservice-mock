package com.lendage.api.avmservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReportDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-12T19:14:53.960-07:00[America/Los_Angeles]")

public class ReportDetails   {
  @JsonProperty("report_date")
  private String reportDate;

  @JsonProperty("report_number")
  private String reportNumber;

  @JsonProperty("value_date")
  private String valueDate;

  @JsonProperty("value_time")
  private String valueTime;

  public ReportDetails reportDate(String reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  /**
   * Get reportDate
   * @return reportDate
  */
  @ApiModelProperty(value = "")


  public String getReportDate() {
    return reportDate;
  }

  public void setReportDate(String reportDate) {
    this.reportDate = reportDate;
  }

  public ReportDetails reportNumber(String reportNumber) {
    this.reportNumber = reportNumber;
    return this;
  }

  /**
   * Get reportNumber
   * @return reportNumber
  */
  @ApiModelProperty(value = "")


  public String getReportNumber() {
    return reportNumber;
  }

  public void setReportNumber(String reportNumber) {
    this.reportNumber = reportNumber;
  }

  public ReportDetails valueDate(String valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * Get valueDate
   * @return valueDate
  */
  @ApiModelProperty(value = "")


  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }

  public ReportDetails valueTime(String valueTime) {
    this.valueTime = valueTime;
    return this;
  }

  /**
   * Get valueTime
   * @return valueTime
  */
  @ApiModelProperty(value = "")


  public String getValueTime() {
    return valueTime;
  }

  public void setValueTime(String valueTime) {
    this.valueTime = valueTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDetails reportDetails = (ReportDetails) o;
    return Objects.equals(this.reportDate, reportDetails.reportDate) &&
        Objects.equals(this.reportNumber, reportDetails.reportNumber) &&
        Objects.equals(this.valueDate, reportDetails.valueDate) &&
        Objects.equals(this.valueTime, reportDetails.valueTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDate, reportNumber, valueDate, valueTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDetails {\n");
    
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    reportNumber: ").append(toIndentedString(reportNumber)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    valueTime: ").append(toIndentedString(valueTime)).append("\n");
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

