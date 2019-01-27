package com.microservice1.microservice1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * Post user Account data.
 */
@ApiModel(description = "Post user Account data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-26T18:17:54.933-06:00")

public class PostUserAccount  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("password")
  private String password = null;

  public PostUserAccount userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * User name
   * @return userName
  **/
  @ApiModelProperty(required = true, value = "User name")
  @NotNull

@Size(min=1,max=30) 
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public PostUserAccount password(String password) {
    this.password = password;
    return this;
  }

  /**
   * User password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "User password")
  @NotNull

@Size(min=6,max=12) 
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUserAccount postUserAccount = (PostUserAccount) o;
    return Objects.equals(this.userName, postUserAccount.userName) &&
        Objects.equals(this.password, postUserAccount.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUserAccount {\n");

    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

