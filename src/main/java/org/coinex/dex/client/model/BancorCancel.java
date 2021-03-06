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
 * BancorCancel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class BancorCancel {
  @SerializedName("base_req")
  private BaseReq baseReq = null;

  @SerializedName("stock")
  private String stock = null;

  @SerializedName("money")
  private String money = null;

  public BancorCancel baseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
    return this;
  }

   /**
   * Get baseReq
   * @return baseReq
  **/
  @ApiModelProperty(required = true, value = "")
  public BaseReq getBaseReq() {
    return baseReq;
  }

  public void setBaseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
  }

  public BancorCancel stock(String stock) {
    this.stock = stock;
    return this;
  }

   /**
   * Get stock
   * @return stock
  **/
  @ApiModelProperty(example = "btc", required = true, value = "")
  public String getStock() {
    return stock;
  }

  public void setStock(String stock) {
    this.stock = stock;
  }

  public BancorCancel money(String money) {
    this.money = money;
    return this;
  }

   /**
   * Get money
   * @return money
  **/
  @ApiModelProperty(example = "cet", required = true, value = "")
  public String getMoney() {
    return money;
  }

  public void setMoney(String money) {
    this.money = money;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BancorCancel bancorCancel = (BancorCancel) o;
    return Objects.equals(this.baseReq, bancorCancel.baseReq) &&
        Objects.equals(this.stock, bancorCancel.stock) &&
        Objects.equals(this.money, bancorCancel.money);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseReq, stock, money);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BancorCancel {\n");
    
    sb.append("    baseReq: ").append(toIndentedString(baseReq)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    money: ").append(toIndentedString(money)).append("\n");
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

