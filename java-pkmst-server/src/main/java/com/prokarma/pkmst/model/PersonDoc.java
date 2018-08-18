package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PersonDoc
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2018-08-18T07:07:33.250Z")

public class PersonDoc   {
  @JsonProperty("id")
  private Long id = null;

  /**
   * PersonDoc type
   */
  public enum TypeDocEnum {
    PASSPORT("Passport"),
    
    FOREIGN_PASSPORT("Foreign passport"),
    
    SEAMAN_PASSPORT("Seaman passport");

    private String value;

    TypeDocEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeDocEnum fromValue(String text) {
      for (TypeDocEnum b : TypeDocEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("TypeDoc")
  private TypeDocEnum typeDoc = null;

  @JsonProperty("SeriaDoc")
  private String seriaDoc = null;

  @JsonProperty("NumDoc")
  private String numDoc = null;

  @JsonProperty("Issuer")
  private String issuer = null;

  @JsonProperty("IssueDate")
  private LocalDate issueDate = null;

  public PersonDoc id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PersonDoc typeDoc(TypeDocEnum typeDoc) {
    this.typeDoc = typeDoc;
    return this;
  }

   /**
   * PersonDoc type
   * @return typeDoc
  **/
  @ApiModelProperty(required = true, value = "PersonDoc type")
  public TypeDocEnum getTypeDoc() {
    return typeDoc;
  }

  public void setTypeDoc(TypeDocEnum typeDoc) {
    this.typeDoc = typeDoc;
  }

  public PersonDoc seriaDoc(String seriaDoc) {
    this.seriaDoc = seriaDoc;
    return this;
  }

   /**
   * Get seriaDoc
   * @return seriaDoc
  **/
  @ApiModelProperty(value = "")
  public String getSeriaDoc() {
    return seriaDoc;
  }

  public void setSeriaDoc(String seriaDoc) {
    this.seriaDoc = seriaDoc;
  }

  public PersonDoc numDoc(String numDoc) {
    this.numDoc = numDoc;
    return this;
  }

   /**
   * Get numDoc
   * @return numDoc
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNumDoc() {
    return numDoc;
  }

  public void setNumDoc(String numDoc) {
    this.numDoc = numDoc;
  }

  public PersonDoc issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public PersonDoc issueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Get issueDate
   * @return issueDate
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonDoc personDoc = (PersonDoc) o;
    return Objects.equals(this.id, personDoc.id) &&
        Objects.equals(this.typeDoc, personDoc.typeDoc) &&
        Objects.equals(this.seriaDoc, personDoc.seriaDoc) &&
        Objects.equals(this.numDoc, personDoc.numDoc) &&
        Objects.equals(this.issuer, personDoc.issuer) &&
        Objects.equals(this.issueDate, personDoc.issueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, typeDoc, seriaDoc, numDoc, issuer, issueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonDoc {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    typeDoc: ").append(toIndentedString(typeDoc)).append("\n");
    sb.append("    seriaDoc: ").append(toIndentedString(seriaDoc)).append("\n");
    sb.append("    numDoc: ").append(toIndentedString(numDoc)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
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

