package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PersonDoc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ClientCard
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2018-08-18T07:07:33.250Z")

public class ClientCard   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Surname")
  private String surname = null;

  @JsonProperty("ParentName")
  private String parentName = null;

  @JsonProperty("PersonDocs")
  
  private List<PersonDoc> personDocs = new ArrayList<>();

  @JsonProperty("Phone")
  private String phone = null;

  @JsonProperty("DateBirth")
  private LocalDate dateBirth = null;

  @JsonProperty("Address")
  private String address = null;

  @JsonProperty("PersFlag")
  private Boolean persFlag = null;

  @JsonProperty("AdvFlag")
  private Boolean advFlag = null;

  public ClientCard id(Long id) {
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

  public ClientCard name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientCard surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public ClientCard parentName(String parentName) {
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

  public ClientCard personDocs(List<PersonDoc> personDocs) {
    this.personDocs = personDocs;
    return this;
  }

  public ClientCard addPersonDocsItem(PersonDoc personDocsItem) {
    this.personDocs.add(personDocsItem);
    return this;
  }

   /**
   * Personal Docs
   * @return personDocs
  **/
  @ApiModelProperty(required = true, value = "Personal Docs")
  public List<PersonDoc> getPersonDocs() {
    return personDocs;
  }

  public void setPersonDocs(List<PersonDoc> personDocs) {
    this.personDocs = personDocs;
  }

  public ClientCard phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ClientCard dateBirth(LocalDate dateBirth) {
    this.dateBirth = dateBirth;
    return this;
  }

   /**
   * Get dateBirth
   * @return dateBirth
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getDateBirth() {
    return dateBirth;
  }

  public void setDateBirth(LocalDate dateBirth) {
    this.dateBirth = dateBirth;
  }

  public ClientCard address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ClientCard persFlag(Boolean persFlag) {
    this.persFlag = persFlag;
    return this;
  }

   /**
   * Get persFlag
   * @return persFlag
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isPersFlag() {
    return persFlag;
  }

  public void setPersFlag(Boolean persFlag) {
    this.persFlag = persFlag;
  }

  public ClientCard advFlag(Boolean advFlag) {
    this.advFlag = advFlag;
    return this;
  }

   /**
   * Get advFlag
   * @return advFlag
  **/
  @ApiModelProperty(value = "")
  public Boolean isAdvFlag() {
    return advFlag;
  }

  public void setAdvFlag(Boolean advFlag) {
    this.advFlag = advFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientCard clientCard = (ClientCard) o;
    return Objects.equals(this.id, clientCard.id) &&
        Objects.equals(this.name, clientCard.name) &&
        Objects.equals(this.surname, clientCard.surname) &&
        Objects.equals(this.parentName, clientCard.parentName) &&
        Objects.equals(this.personDocs, clientCard.personDocs) &&
        Objects.equals(this.phone, clientCard.phone) &&
        Objects.equals(this.dateBirth, clientCard.dateBirth) &&
        Objects.equals(this.address, clientCard.address) &&
        Objects.equals(this.persFlag, clientCard.persFlag) &&
        Objects.equals(this.advFlag, clientCard.advFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, surname, parentName, personDocs, phone, dateBirth, address, persFlag, advFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientCard {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    personDocs: ").append(toIndentedString(personDocs)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    dateBirth: ").append(toIndentedString(dateBirth)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    persFlag: ").append(toIndentedString(persFlag)).append("\n");
    sb.append("    advFlag: ").append(toIndentedString(advFlag)).append("\n");
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

