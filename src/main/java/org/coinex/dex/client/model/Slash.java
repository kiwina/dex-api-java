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
 * Slash
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class Slash {
  @SerializedName("validator")
  private String validator = null;

  @SerializedName("power")
  private String power = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("jailed")
  private Boolean jailed = null;

  public Slash validator(String validator) {
    this.validator = validator;
    return this;
  }

   /**
   * Get validator
   * @return validator
  **/
  @ApiModelProperty(value = "")
  public String getValidator() {
    return validator;
  }

  public void setValidator(String validator) {
    this.validator = validator;
  }

  public Slash power(String power) {
    this.power = power;
    return this;
  }

   /**
   * Vote power
   * @return power
  **/
  @ApiModelProperty(example = "0", value = "Vote power")
  public String getPower() {
    return power;
  }

  public void setPower(String power) {
    this.power = power;
  }

  public Slash reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(example = "", value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Slash jailed(Boolean jailed) {
    this.jailed = jailed;
    return this;
  }

   /**
   * Get jailed
   * @return jailed
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isJailed() {
    return jailed;
  }

  public void setJailed(Boolean jailed) {
    this.jailed = jailed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Slash slash = (Slash) o;
    return Objects.equals(this.validator, slash.validator) &&
        Objects.equals(this.power, slash.power) &&
        Objects.equals(this.reason, slash.reason) &&
        Objects.equals(this.jailed, slash.jailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validator, power, reason, jailed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Slash {\n");
    
    sb.append("    validator: ").append(toIndentedString(validator)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    jailed: ").append(toIndentedString(jailed)).append("\n");
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
