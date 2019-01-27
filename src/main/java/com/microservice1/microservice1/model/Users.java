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
 * List of All Available Users
 */
@ApiModel(description = "List of All Available Users")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-26T18:17:54.933-06:00")

public class Users  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("users")
  @Valid
  private List<UserModel> users = null;

  public Users users(List<UserModel> users) {
    this.users = users;
    return this;
  }

  public Users addUsersItem(UserModel usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * List of All Available Users
   * @return users
  **/
  @ApiModelProperty(value = "List of All Available Users")

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
    Users users = (Users) o;
    return Objects.equals(this.users, users.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Users {\n");

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

