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
 * UnbondingEntries
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class UnbondingEntries {
  @SerializedName("initial_balance")
  private String initialBalance = null;

  @SerializedName("balance")
  private String balance = null;

  @SerializedName("creation_height")
  private String creationHeight = null;

  @SerializedName("completion_time")
  private String completionTime = null;

  public UnbondingEntries initialBalance(String initialBalance) {
    this.initialBalance = initialBalance;
    return this;
  }

   /**
   * Get initialBalance
   * @return initialBalance
  **/
  @ApiModelProperty(required = true, value = "")
  public String getInitialBalance() {
    return initialBalance;
  }

  public void setInitialBalance(String initialBalance) {
    this.initialBalance = initialBalance;
  }

  public UnbondingEntries balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public UnbondingEntries creationHeight(String creationHeight) {
    this.creationHeight = creationHeight;
    return this;
  }

   /**
   * Get creationHeight
   * @return creationHeight
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCreationHeight() {
    return creationHeight;
  }

  public void setCreationHeight(String creationHeight) {
    this.creationHeight = creationHeight;
  }

  public UnbondingEntries completionTime(String completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Get completionTime
   * @return completionTime
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(String completionTime) {
    this.completionTime = completionTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnbondingEntries unbondingEntries = (UnbondingEntries) o;
    return Objects.equals(this.initialBalance, unbondingEntries.initialBalance) &&
        Objects.equals(this.balance, unbondingEntries.balance) &&
        Objects.equals(this.creationHeight, unbondingEntries.creationHeight) &&
        Objects.equals(this.completionTime, unbondingEntries.completionTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialBalance, balance, creationHeight, completionTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnbondingEntries {\n");
    
    sb.append("    initialBalance: ").append(toIndentedString(initialBalance)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    creationHeight: ").append(toIndentedString(creationHeight)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
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

