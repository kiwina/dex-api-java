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


package org.coinex.dex.client.model;

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
 * InlineResponse20050Result
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class InlineResponse20050Result {
  @SerializedName("fee_for_alias_length_2")
  private String feeForAliasLength2 = null;

  @SerializedName("fee_for_alias_length_3")
  private String feeForAliasLength3 = null;

  @SerializedName("fee_for_alias_length_4")
  private String feeForAliasLength4 = null;

  @SerializedName("fee_for_alias_length_5")
  private String feeForAliasLength5 = null;

  @SerializedName("fee_for_alias_length_6")
  private String feeForAliasLength6 = null;

  @SerializedName("fee_for_alias_length_7_or_higher")
  private String feeForAliasLength7OrHigher = null;

  @SerializedName("max_alias_count")
  private String maxAliasCount = null;

  public InlineResponse20050Result feeForAliasLength2(String feeForAliasLength2) {
    this.feeForAliasLength2 = feeForAliasLength2;
    return this;
  }

   /**
   * Get feeForAliasLength2
   * @return feeForAliasLength2
  **/
  @ApiModelProperty(value = "")
  public String getFeeForAliasLength2() {
    return feeForAliasLength2;
  }

  public void setFeeForAliasLength2(String feeForAliasLength2) {
    this.feeForAliasLength2 = feeForAliasLength2;
  }

  public InlineResponse20050Result feeForAliasLength3(String feeForAliasLength3) {
    this.feeForAliasLength3 = feeForAliasLength3;
    return this;
  }

   /**
   * Get feeForAliasLength3
   * @return feeForAliasLength3
  **/
  @ApiModelProperty(value = "")
  public String getFeeForAliasLength3() {
    return feeForAliasLength3;
  }

  public void setFeeForAliasLength3(String feeForAliasLength3) {
    this.feeForAliasLength3 = feeForAliasLength3;
  }

  public InlineResponse20050Result feeForAliasLength4(String feeForAliasLength4) {
    this.feeForAliasLength4 = feeForAliasLength4;
    return this;
  }

   /**
   * Get feeForAliasLength4
   * @return feeForAliasLength4
  **/
  @ApiModelProperty(value = "")
  public String getFeeForAliasLength4() {
    return feeForAliasLength4;
  }

  public void setFeeForAliasLength4(String feeForAliasLength4) {
    this.feeForAliasLength4 = feeForAliasLength4;
  }

  public InlineResponse20050Result feeForAliasLength5(String feeForAliasLength5) {
    this.feeForAliasLength5 = feeForAliasLength5;
    return this;
  }

   /**
   * Get feeForAliasLength5
   * @return feeForAliasLength5
  **/
  @ApiModelProperty(value = "")
  public String getFeeForAliasLength5() {
    return feeForAliasLength5;
  }

  public void setFeeForAliasLength5(String feeForAliasLength5) {
    this.feeForAliasLength5 = feeForAliasLength5;
  }

  public InlineResponse20050Result feeForAliasLength6(String feeForAliasLength6) {
    this.feeForAliasLength6 = feeForAliasLength6;
    return this;
  }

   /**
   * Get feeForAliasLength6
   * @return feeForAliasLength6
  **/
  @ApiModelProperty(value = "")
  public String getFeeForAliasLength6() {
    return feeForAliasLength6;
  }

  public void setFeeForAliasLength6(String feeForAliasLength6) {
    this.feeForAliasLength6 = feeForAliasLength6;
  }

  public InlineResponse20050Result feeForAliasLength7OrHigher(String feeForAliasLength7OrHigher) {
    this.feeForAliasLength7OrHigher = feeForAliasLength7OrHigher;
    return this;
  }

   /**
   * Get feeForAliasLength7OrHigher
   * @return feeForAliasLength7OrHigher
  **/
  @ApiModelProperty(value = "")
  public String getFeeForAliasLength7OrHigher() {
    return feeForAliasLength7OrHigher;
  }

  public void setFeeForAliasLength7OrHigher(String feeForAliasLength7OrHigher) {
    this.feeForAliasLength7OrHigher = feeForAliasLength7OrHigher;
  }

  public InlineResponse20050Result maxAliasCount(String maxAliasCount) {
    this.maxAliasCount = maxAliasCount;
    return this;
  }

   /**
   * Get maxAliasCount
   * @return maxAliasCount
  **/
  @ApiModelProperty(value = "")
  public String getMaxAliasCount() {
    return maxAliasCount;
  }

  public void setMaxAliasCount(String maxAliasCount) {
    this.maxAliasCount = maxAliasCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20050Result inlineResponse20050Result = (InlineResponse20050Result) o;
    return Objects.equals(this.feeForAliasLength2, inlineResponse20050Result.feeForAliasLength2) &&
        Objects.equals(this.feeForAliasLength3, inlineResponse20050Result.feeForAliasLength3) &&
        Objects.equals(this.feeForAliasLength4, inlineResponse20050Result.feeForAliasLength4) &&
        Objects.equals(this.feeForAliasLength5, inlineResponse20050Result.feeForAliasLength5) &&
        Objects.equals(this.feeForAliasLength6, inlineResponse20050Result.feeForAliasLength6) &&
        Objects.equals(this.feeForAliasLength7OrHigher, inlineResponse20050Result.feeForAliasLength7OrHigher) &&
        Objects.equals(this.maxAliasCount, inlineResponse20050Result.maxAliasCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeForAliasLength2, feeForAliasLength3, feeForAliasLength4, feeForAliasLength5, feeForAliasLength6, feeForAliasLength7OrHigher, maxAliasCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20050Result {\n");
    
    sb.append("    feeForAliasLength2: ").append(toIndentedString(feeForAliasLength2)).append("\n");
    sb.append("    feeForAliasLength3: ").append(toIndentedString(feeForAliasLength3)).append("\n");
    sb.append("    feeForAliasLength4: ").append(toIndentedString(feeForAliasLength4)).append("\n");
    sb.append("    feeForAliasLength5: ").append(toIndentedString(feeForAliasLength5)).append("\n");
    sb.append("    feeForAliasLength6: ").append(toIndentedString(feeForAliasLength6)).append("\n");
    sb.append("    feeForAliasLength7OrHigher: ").append(toIndentedString(feeForAliasLength7OrHigher)).append("\n");
    sb.append("    maxAliasCount: ").append(toIndentedString(maxAliasCount)).append("\n");
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

