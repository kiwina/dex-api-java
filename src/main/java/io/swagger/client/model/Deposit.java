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
import io.swagger.client.model.Coin;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Deposit
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-26T10:53:15.911+08:00[Asia/Shanghai]")
public class Deposit {
  @SerializedName("amount")
  private List<Coin> amount = new ArrayList<Coin>();

  @SerializedName("proposal_id")
  private String proposalId = null;

  @SerializedName("depositor")
  private String depositor = null;

  public Deposit amount(List<Coin> amount) {
    this.amount = amount;
    return this;
  }

  public Deposit addAmountItem(Coin amountItem) {
    this.amount.add(amountItem);
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(required = true, description = "")
  public List<Coin> getAmount() {
    return amount;
  }

  public void setAmount(List<Coin> amount) {
    this.amount = amount;
  }

  public Deposit proposalId(String proposalId) {
    this.proposalId = proposalId;
    return this;
  }

   /**
   * Get proposalId
   * @return proposalId
  **/
  @Schema(required = true, description = "")
  public String getProposalId() {
    return proposalId;
  }

  public void setProposalId(String proposalId) {
    this.proposalId = proposalId;
  }

  public Deposit depositor(String depositor) {
    this.depositor = depositor;
    return this;
  }

   /**
   * Get depositor
   * @return depositor
  **/
  @Schema(required = true, description = "")
  public String getDepositor() {
    return depositor;
  }

  public void setDepositor(String depositor) {
    this.depositor = depositor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deposit deposit = (Deposit) o;
    return Objects.equals(this.amount, deposit.amount) &&
        Objects.equals(this.proposalId, deposit.proposalId) &&
        Objects.equals(this.depositor, deposit.depositor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, proposalId, depositor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deposit {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    proposalId: ").append(toIndentedString(proposalId)).append("\n");
    sb.append("    depositor: ").append(toIndentedString(depositor)).append("\n");
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