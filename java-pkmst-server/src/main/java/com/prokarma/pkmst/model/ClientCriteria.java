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
 * ClientCriteria
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2018-08-18T07:07:33.250Z")

public class ClientCriteria   {
  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Surname")
  private String surname = null;

  @JsonProperty("ParentName")
  private String parentName = null;

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

  public ClientCriteria name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientCriteria surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(value = "")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public ClientCriteria parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

   /**
   * Get parentName
   * @return parentName
  **/
  @ApiModelProperty(value = "")
  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public ClientCriteria typeDoc(TypeDocEnum typeDoc) {
    this.typeDoc = typeDoc;
    return this;
  }

   /**
   * PersonDoc type
   * @return typeDoc
  **/
  @ApiModelProperty(value = "PersonDoc type")
  public TypeDocEnum getTypeDoc() {
    return typeDoc;
  }

  public void setTypeDoc(TypeDocEnum typeDoc) {
    this.typeDoc = typeDoc;
  }

  public ClientCriteria seriaDoc(String seriaDoc) {
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

  public ClientCriteria numDoc(String numDoc) {
    this.numDoc = numDoc;
    return this;
  }

   /**
   * Get numDoc
   * @return numDoc
  **/
  @ApiModelProperty(value = "")
  public String getNumDoc() {
    return numDoc;
  }

  public void setNumDoc(String numDoc) {
    this.numDoc = numDoc;
  }

  public ClientCriteria issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public ClientCriteria issueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Get issueDate
   * @return issueDate
  **/
  @ApiModelProperty(value = "")
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
    ClientCriteria clientCriteria = (ClientCriteria) o;
    return Objects.equals(this.name, clientCriteria.name) &&
        Objects.equals(this.surname, clientCriteria.surname) &&
        Objects.equals(this.parentName, clientCriteria.parentName) &&
        Objects.equals(this.typeDoc, clientCriteria.typeDoc) &&
        Objects.equals(this.seriaDoc, clientCriteria.seriaDoc) &&
        Objects.equals(this.numDoc, clientCriteria.numDoc) &&
        Objects.equals(this.issuer, clientCriteria.issuer) &&
        Objects.equals(this.issueDate, clientCriteria.issueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname, parentName, typeDoc, seriaDoc, numDoc, issuer, issueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientCriteria {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
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

