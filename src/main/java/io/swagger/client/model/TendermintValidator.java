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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TendermintValidator
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-26T10:53:15.911+08:00[Asia/Shanghai]")
public class TendermintValidator {
  @SerializedName("address")
  private String address = null;

  @SerializedName("pub_key")
  private String pubKey = null;

  @SerializedName("voting_power")
  private String votingPower = null;

  @SerializedName("proposer_priority")
  private String proposerPriority = null;

  public TendermintValidator address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(required = true, description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public TendermintValidator pubKey(String pubKey) {
    this.pubKey = pubKey;
    return this;
  }

   /**
   * Get pubKey
   * @return pubKey
  **/
  @Schema(example = "coinexvalconspub1zcjduepq7sjfglw7ra4mjxpw4ph7dtdhdheh7nz8dfgl6t8u2n5szuuql9mqsrwquu", required = true, description = "")
  public String getPubKey() {
    return pubKey;
  }

  public void setPubKey(String pubKey) {
    this.pubKey = pubKey;
  }

  public TendermintValidator votingPower(String votingPower) {
    this.votingPower = votingPower;
    return this;
  }

   /**
   * Get votingPower
   * @return votingPower
  **/
  @Schema(example = "1000", required = true, description = "")
  public String getVotingPower() {
    return votingPower;
  }

  public void setVotingPower(String votingPower) {
    this.votingPower = votingPower;
  }

  public TendermintValidator proposerPriority(String proposerPriority) {
    this.proposerPriority = proposerPriority;
    return this;
  }

   /**
   * Get proposerPriority
   * @return proposerPriority
  **/
  @Schema(example = "1000", required = true, description = "")
  public String getProposerPriority() {
    return proposerPriority;
  }

  public void setProposerPriority(String proposerPriority) {
    this.proposerPriority = proposerPriority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TendermintValidator tendermintValidator = (TendermintValidator) o;
    return Objects.equals(this.address, tendermintValidator.address) &&
        Objects.equals(this.pubKey, tendermintValidator.pubKey) &&
        Objects.equals(this.votingPower, tendermintValidator.votingPower) &&
        Objects.equals(this.proposerPriority, tendermintValidator.proposerPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, pubKey, votingPower, proposerPriority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TendermintValidator {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    pubKey: ").append(toIndentedString(pubKey)).append("\n");
    sb.append("    votingPower: ").append(toIndentedString(votingPower)).append("\n");
    sb.append("    proposerPriority: ").append(toIndentedString(proposerPriority)).append("\n");
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