/*
 * CET-Lite for CoinEx Chain
 * A REST interface for state queries, transaction generation and broadcasting.
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ValidatorCommissionCommissionRates
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class ValidatorCommissionCommissionRates {
  @SerializedName("rate")
  private String rate = null;

  @SerializedName("max_rate")
  private String maxRate = null;

  @SerializedName("max_change_rate")
  private String maxChangeRate = null;

  public ValidatorCommissionCommissionRates rate(String rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(example = "0", required = true, value = "")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public ValidatorCommissionCommissionRates maxRate(String maxRate) {
    this.maxRate = maxRate;
    return this;
  }

   /**
   * Get maxRate
   * @return maxRate
  **/
  @ApiModelProperty(example = "0", required = true, value = "")
  public String getMaxRate() {
    return maxRate;
  }

  public void setMaxRate(String maxRate) {
    this.maxRate = maxRate;
  }

  public ValidatorCommissionCommissionRates maxChangeRate(String maxChangeRate) {
    this.maxChangeRate = maxChangeRate;
    return this;
  }

   /**
   * Get maxChangeRate
   * @return maxChangeRate
  **/
  @ApiModelProperty(example = "0", required = true, value = "")
  public String getMaxChangeRate() {
    return maxChangeRate;
  }

  public void setMaxChangeRate(String maxChangeRate) {
    this.maxChangeRate = maxChangeRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatorCommissionCommissionRates validatorCommissionCommissionRates = (ValidatorCommissionCommissionRates) o;
    return Objects.equals(this.rate, validatorCommissionCommissionRates.rate) &&
        Objects.equals(this.maxRate, validatorCommissionCommissionRates.maxRate) &&
        Objects.equals(this.maxChangeRate, validatorCommissionCommissionRates.maxChangeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, maxRate, maxChangeRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatorCommissionCommissionRates {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    maxRate: ").append(toIndentedString(maxRate)).append("\n");
    sb.append("    maxChangeRate: ").append(toIndentedString(maxChangeRate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
