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
import org.coinex.dex.client.model.BaseReq;

/**
 * Info1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class Info1 {
  @SerializedName("base_req")
  private BaseReq baseReq = null;

  @SerializedName("price_precision")
  private String pricePrecision = null;

  @SerializedName("trading_pair")
  private String tradingPair = null;

  public Info1 baseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
    return this;
  }

   /**
   * Get baseReq
   * @return baseReq
  **/
  @ApiModelProperty(value = "")
  public BaseReq getBaseReq() {
    return baseReq;
  }

  public void setBaseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
  }

  public Info1 pricePrecision(String pricePrecision) {
    this.pricePrecision = pricePrecision;
    return this;
  }

   /**
   * Get pricePrecision
   * @return pricePrecision
  **/
  @ApiModelProperty(example = "10", value = "")
  public String getPricePrecision() {
    return pricePrecision;
  }

  public void setPricePrecision(String pricePrecision) {
    this.pricePrecision = pricePrecision;
  }

  public Info1 tradingPair(String tradingPair) {
    this.tradingPair = tradingPair;
    return this;
  }

   /**
   * Get tradingPair
   * @return tradingPair
  **/
  @ApiModelProperty(example = "etc/cet", value = "")
  public String getTradingPair() {
    return tradingPair;
  }

  public void setTradingPair(String tradingPair) {
    this.tradingPair = tradingPair;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Info1 info1 = (Info1) o;
    return Objects.equals(this.baseReq, info1.baseReq) &&
        Objects.equals(this.pricePrecision, info1.pricePrecision) &&
        Objects.equals(this.tradingPair, info1.tradingPair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseReq, pricePrecision, tradingPair);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Info1 {\n");
    
    sb.append("    baseReq: ").append(toIndentedString(baseReq)).append("\n");
    sb.append("    pricePrecision: ").append(toIndentedString(pricePrecision)).append("\n");
    sb.append("    tradingPair: ").append(toIndentedString(tradingPair)).append("\n");
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

