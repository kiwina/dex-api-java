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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tx
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class Tx {
  @SerializedName("tx")
  private StdTx tx = null;

  public Tx tx(StdTx tx) {
    this.tx = tx;
    return this;
  }

   /**
   * Get tx
   * @return tx
  **/
  @ApiModelProperty(value = "")
  public StdTx getTx() {
    return tx;
  }

  public void setTx(StdTx tx) {
    this.tx = tx;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tx tx = (Tx) o;
    return Objects.equals(this.tx, tx.tx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tx);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tx {\n");
    
    sb.append("    tx: ").append(toIndentedString(tx)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
