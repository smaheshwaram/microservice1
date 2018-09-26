package com.microservice1.microservice1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * List of All Available UsersModel
 */
@ApiModel(description = "List of All Available UsersModel")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-24T22:04:02.298-05:00")

public class UsersModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("users")
  @Valid
  private List<UserModel> users = null;

  public UsersModel users(List<UserModel> users) {
    this.users = users;
    return this;
  }

  public UsersModel addUsersItem(UserModel usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * List of All Available UsersModel
   * @return users
  **/
  @ApiModelProperty(value = "List of All Available UsersModel")

  @Valid

  public List<UserModel> getUsers() {
    return users;
  }

  public void setUsers(List<UserModel> users) {
    this.users = users;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersModel users = (UsersModel) o;
    return Objects.equals(this.users, users.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersModel {\n");

    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

