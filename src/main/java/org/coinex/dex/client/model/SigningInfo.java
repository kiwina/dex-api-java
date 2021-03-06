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
 * SigningInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class SigningInfo {
  @SerializedName("start_height")
  private String startHeight = null;

  @SerializedName("index_offset")
  private String indexOffset = null;

  @SerializedName("jailed_until")
  private String jailedUntil = null;

  @SerializedName("missed_blocks_counter")
  private String missedBlocksCounter = null;

  public SigningInfo startHeight(String startHeight) {
    this.startHeight = startHeight;
    return this;
  }

   /**
   * Get startHeight
   * @return startHeight
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStartHeight() {
    return startHeight;
  }

  public void setStartHeight(String startHeight) {
    this.startHeight = startHeight;
  }

  public SigningInfo indexOffset(String indexOffset) {
    this.indexOffset = indexOffset;
    return this;
  }

   /**
   * Get indexOffset
   * @return indexOffset
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIndexOffset() {
    return indexOffset;
  }

  public void setIndexOffset(String indexOffset) {
    this.indexOffset = indexOffset;
  }

  public SigningInfo jailedUntil(String jailedUntil) {
    this.jailedUntil = jailedUntil;
    return this;
  }

   /**
   * Get jailedUntil
   * @return jailedUntil
  **/
  @ApiModelProperty(required = true, value = "")
  public String getJailedUntil() {
    return jailedUntil;
  }

  public void setJailedUntil(String jailedUntil) {
    this.jailedUntil = jailedUntil;
  }

  public SigningInfo missedBlocksCounter(String missedBlocksCounter) {
    this.missedBlocksCounter = missedBlocksCounter;
    return this;
  }

   /**
   * Get missedBlocksCounter
   * @return missedBlocksCounter
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMissedBlocksCounter() {
    return missedBlocksCounter;
  }

  public void setMissedBlocksCounter(String missedBlocksCounter) {
    this.missedBlocksCounter = missedBlocksCounter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningInfo signingInfo = (SigningInfo) o;
    return Objects.equals(this.startHeight, signingInfo.startHeight) &&
        Objects.equals(this.indexOffset, signingInfo.indexOffset) &&
        Objects.equals(this.jailedUntil, signingInfo.jailedUntil) &&
        Objects.equals(this.missedBlocksCounter, signingInfo.missedBlocksCounter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startHeight, indexOffset, jailedUntil, missedBlocksCounter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningInfo {\n");
    
    sb.append("    startHeight: ").append(toIndentedString(startHeight)).append("\n");
    sb.append("    indexOffset: ").append(toIndentedString(indexOffset)).append("\n");
    sb.append("    jailedUntil: ").append(toIndentedString(jailedUntil)).append("\n");
    sb.append("    missedBlocksCounter: ").append(toIndentedString(missedBlocksCounter)).append("\n");
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

