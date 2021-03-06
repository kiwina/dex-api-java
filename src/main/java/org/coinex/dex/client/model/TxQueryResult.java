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
import org.coinex.dex.client.model.KVPair;

/**
 * TxQueryResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class TxQueryResult {
  @SerializedName("logs")
  private String logs = null;

  @SerializedName("gas_wanted")
  private String gasWanted = null;

  @SerializedName("gas_used")
  private String gasUsed = null;

  @SerializedName("tags")
  private List<KVPair> tags = null;

  public TxQueryResult logs(String logs) {
    this.logs = logs;
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @ApiModelProperty(value = "")
  public String getLogs() {
    return logs;
  }

  public void setLogs(String logs) {
    this.logs = logs;
  }

  public TxQueryResult gasWanted(String gasWanted) {
    this.gasWanted = gasWanted;
    return this;
  }

   /**
   * Get gasWanted
   * @return gasWanted
  **/
  @ApiModelProperty(example = "0", value = "")
  public String getGasWanted() {
    return gasWanted;
  }

  public void setGasWanted(String gasWanted) {
    this.gasWanted = gasWanted;
  }

  public TxQueryResult gasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Get gasUsed
   * @return gasUsed
  **/
  @ApiModelProperty(example = "0", value = "")
  public String getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }

  public TxQueryResult tags(List<KVPair> tags) {
    this.tags = tags;
    return this;
  }

  public TxQueryResult addTagsItem(KVPair tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<KVPair> getTags() {
    return tags;
  }

  public void setTags(List<KVPair> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxQueryResult txQueryResult = (TxQueryResult) o;
    return Objects.equals(this.logs, txQueryResult.logs) &&
        Objects.equals(this.gasWanted, txQueryResult.gasWanted) &&
        Objects.equals(this.gasUsed, txQueryResult.gasUsed) &&
        Objects.equals(this.tags, txQueryResult.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs, gasWanted, gasUsed, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxQueryResult {\n");
    
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    gasWanted: ").append(toIndentedString(gasWanted)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

