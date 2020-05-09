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
import java.util.ArrayList;
import java.util.List;
import org.coinex.dex.client.model.CancelOrderInfo;

/**
 * UserOrderCancelOrderInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class UserOrderCancelOrderInfo {
  @SerializedName("data")
  private List<CancelOrderInfo> data = null;

  @SerializedName("timesid")
  private List<Long> timesid = null;

  public UserOrderCancelOrderInfo data(List<CancelOrderInfo> data) {
    this.data = data;
    return this;
  }

  public UserOrderCancelOrderInfo addDataItem(CancelOrderInfo dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<CancelOrderInfo> getData() {
    return data;
  }

  public void setData(List<CancelOrderInfo> data) {
    this.data = data;
  }

  public UserOrderCancelOrderInfo timesid(List<Long> timesid) {
    this.timesid = timesid;
    return this;
  }

  public UserOrderCancelOrderInfo addTimesidItem(Long timesidItem) {
    if (this.timesid == null) {
      this.timesid = new ArrayList<>();
    }
    this.timesid.add(timesidItem);
    return this;
  }

   /**
   * Get timesid
   * @return timesid
  **/
  @ApiModelProperty(value = "")
  public List<Long> getTimesid() {
    return timesid;
  }

  public void setTimesid(List<Long> timesid) {
    this.timesid = timesid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOrderCancelOrderInfo userOrderCancelOrderInfo = (UserOrderCancelOrderInfo) o;
    return Objects.equals(this.data, userOrderCancelOrderInfo.data) &&
        Objects.equals(this.timesid, userOrderCancelOrderInfo.timesid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, timesid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOrderCancelOrderInfo {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    timesid: ").append(toIndentedString(timesid)).append("\n");
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
