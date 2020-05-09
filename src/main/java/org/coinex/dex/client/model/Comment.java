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
import org.coinex.dex.client.model.CommentRef;

/**
 * Comment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class Comment {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("donation")
  private Long donation = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("content_type")
  private Integer contentType = null;

  @SerializedName("references")
  private List<CommentRef> references = null;

  @SerializedName("tx_hash")
  private String txHash = null;

  public Comment id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Comment height(Long height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(example = "0", value = "")
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public Comment sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public Comment token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "abc", value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Comment donation(Long donation) {
    this.donation = donation;
    return this;
  }

   /**
   * Get donation
   * @return donation
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getDonation() {
    return donation;
  }

  public void setDonation(Long donation) {
    this.donation = donation;
  }

  public Comment title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "First Comment", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Comment content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "Comment content", value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Comment contentType(Integer contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * IPFS:0,Magnet:1,HTTP:2,UTF8Text:3,RawBytes:6
   * @return contentType
  **/
  @ApiModelProperty(example = "3", value = "IPFS:0,Magnet:1,HTTP:2,UTF8Text:3,RawBytes:6")
  public Integer getContentType() {
    return contentType;
  }

  public void setContentType(Integer contentType) {
    this.contentType = contentType;
  }

  public Comment references(List<CommentRef> references) {
    this.references = references;
    return this;
  }

  public Comment addReferencesItem(CommentRef referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @ApiModelProperty(value = "")
  public List<CommentRef> getReferences() {
    return references;
  }

  public void setReferences(List<CommentRef> references) {
    this.references = references;
  }

  public Comment txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * The tx hash
   * @return txHash
  **/
  @ApiModelProperty(value = "The tx hash")
  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.height, comment.height) &&
        Objects.equals(this.sender, comment.sender) &&
        Objects.equals(this.token, comment.token) &&
        Objects.equals(this.donation, comment.donation) &&
        Objects.equals(this.title, comment.title) &&
        Objects.equals(this.content, comment.content) &&
        Objects.equals(this.contentType, comment.contentType) &&
        Objects.equals(this.references, comment.references) &&
        Objects.equals(this.txHash, comment.txHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, height, sender, token, donation, title, content, contentType, references, txHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    donation: ").append(toIndentedString(donation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
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
