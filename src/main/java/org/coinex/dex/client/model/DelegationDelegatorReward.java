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
import org.coinex.dex.client.model.Coin;

/**
 * DelegationDelegatorReward
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class DelegationDelegatorReward {
  @SerializedName("validator_address")
  private String validatorAddress = null;

  @SerializedName("reward")
  private List<Coin> reward = new ArrayList<>();

  public DelegationDelegatorReward validatorAddress(String validatorAddress) {
    this.validatorAddress = validatorAddress;
    return this;
  }

   /**
   * Get validatorAddress
   * @return validatorAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public String getValidatorAddress() {
    return validatorAddress;
  }

  public void setValidatorAddress(String validatorAddress) {
    this.validatorAddress = validatorAddress;
  }

  public DelegationDelegatorReward reward(List<Coin> reward) {
    this.reward = reward;
    return this;
  }

  public DelegationDelegatorReward addRewardItem(Coin rewardItem) {
    this.reward.add(rewardItem);
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Coin> getReward() {
    return reward;
  }

  public void setReward(List<Coin> reward) {
    this.reward = reward;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegationDelegatorReward delegationDelegatorReward = (DelegationDelegatorReward) o;
    return Objects.equals(this.validatorAddress, delegationDelegatorReward.validatorAddress) &&
        Objects.equals(this.reward, delegationDelegatorReward.reward);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validatorAddress, reward);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegationDelegatorReward {\n");
    
    sb.append("    validatorAddress: ").append(toIndentedString(validatorAddress)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
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

