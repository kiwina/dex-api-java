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
import org.coinex.dex.client.model.BaseMarket;

/**
 * MarketInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class MarketInfo {
  @SerializedName("stock")
  private String stock = null;

  @SerializedName("money")
  private String money = null;

  @SerializedName("price_precision")
  private String pricePrecision = null;

  @SerializedName("order_precision")
  private String orderPrecision = null;

  @SerializedName("last_executed_price")
  private String lastExecutedPrice = null;

  @SerializedName("creator")
  private String creator = null;

  public MarketInfo stock(String stock) {
    this.stock = stock;
    return this;
  }

   /**
   * Get stock
   * @return stock
  **/
  @ApiModelProperty(example = "abc", required = true, value = "")
  public String getStock() {
    return stock;
  }

  public void setStock(String stock) {
    this.stock = stock;
  }

  public MarketInfo money(String money) {
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

  public MarketInfo pricePrecision(String pricePrecision) {
    this.pricePrecision = pricePrecision;
    return this;
  }

   /**
   * The trading-pair price precision, used to control the price accuracy of the order when token trades, valid range [0, 18]
   * @return pricePrecision
  **/
  @ApiModelProperty(example = "10", required = true, value = "The trading-pair price precision, used to control the price accuracy of the order when token trades, valid range [0, 18]")
  public String getPricePrecision() {
    return pricePrecision;
  }

  public void setPricePrecision(String pricePrecision) {
    this.pricePrecision = pricePrecision;
  }

  public MarketInfo orderPrecision(String orderPrecision) {
    this.orderPrecision = orderPrecision;
    return this;
  }

   /**
   * To control the granularity of token trade, the token amount of trade must be a multiple of granularity.
   * @return orderPrecision
  **/
  @ApiModelProperty(example = "0", value = "To control the granularity of token trade, the token amount of trade must be a multiple of granularity.")
  public String getOrderPrecision() {
    return orderPrecision;
  }

  public void setOrderPrecision(String orderPrecision) {
    this.orderPrecision = orderPrecision;
  }

  public MarketInfo lastExecutedPrice(String lastExecutedPrice) {
    this.lastExecutedPrice = lastExecutedPrice;
    return this;
  }

   /**
   * Get lastExecutedPrice
   * @return lastExecutedPrice
  **/
  @ApiModelProperty(example = "0.00002", value = "")
  public String getLastExecutedPrice() {
    return lastExecutedPrice;
  }

  public void setLastExecutedPrice(String lastExecutedPrice) {
    this.lastExecutedPrice = lastExecutedPrice;
  }

  public MarketInfo creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(example = "coinex1dmz7e2fddhejdz5n7e3qc5szx3zn2gj3ta8rwj", value = "")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketInfo marketInfo = (MarketInfo) o;
    return Objects.equals(this.stock, marketInfo.stock) &&
        Objects.equals(this.money, marketInfo.money) &&
        Objects.equals(this.pricePrecision, marketInfo.pricePrecision) &&
        Objects.equals(this.orderPrecision, marketInfo.orderPrecision) &&
        Objects.equals(this.lastExecutedPrice, marketInfo.lastExecutedPrice) &&
        Objects.equals(this.creator, marketInfo.creator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stock, money, pricePrecision, orderPrecision, lastExecutedPrice, creator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketInfo {\n");
    
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    money: ").append(toIndentedString(money)).append("\n");
    sb.append("    pricePrecision: ").append(toIndentedString(pricePrecision)).append("\n");
    sb.append("    orderPrecision: ").append(toIndentedString(orderPrecision)).append("\n");
    sb.append("    lastExecutedPrice: ").append(toIndentedString(lastExecutedPrice)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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

