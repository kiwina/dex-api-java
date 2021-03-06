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
import org.coinex.dex.client.model.Block;
import org.coinex.dex.client.model.BlockQueryBlockMeta;

/**
 * BlockQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class BlockQuery {
  @SerializedName("block_meta")
  private BlockQueryBlockMeta blockMeta = null;

  @SerializedName("block")
  private Block block = null;

  public BlockQuery blockMeta(BlockQueryBlockMeta blockMeta) {
    this.blockMeta = blockMeta;
    return this;
  }

   /**
   * Get blockMeta
   * @return blockMeta
  **/
  @ApiModelProperty(value = "")
  public BlockQueryBlockMeta getBlockMeta() {
    return blockMeta;
  }

  public void setBlockMeta(BlockQueryBlockMeta blockMeta) {
    this.blockMeta = blockMeta;
  }

  public BlockQuery block(Block block) {
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @ApiModelProperty(value = "")
  public Block getBlock() {
    return block;
  }

  public void setBlock(Block block) {
    this.block = block;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockQuery blockQuery = (BlockQuery) o;
    return Objects.equals(this.blockMeta, blockQuery.blockMeta) &&
        Objects.equals(this.block, blockQuery.block);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockMeta, block);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockQuery {\n");
    
    sb.append("    blockMeta: ").append(toIndentedString(blockMeta)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
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

