package com.microservice1.microservice1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * User Account data.
 */
@ApiModel(description = "User Account data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-30T19:12:03.962-06:00")

public class UserModel  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("userId")
  private Long userId = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("userAddress")
  private String userAddress = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("email")
  private String email = null;

  public UserModel userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User id for a user account.
   * minimum: 1
   * maximum: 9999999999
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "User id for a user account.")
  @NotNull

@Min(1) @Max(9999999999L)
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public UserModel userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * User name
   * @return userName
  **/
  @ApiModelProperty(value = "User name")

@Size(min=1,max=30) 
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserModel userAddress(String userAddress) {
    this.userAddress = userAddress;
    return this;
  }

  /**
   * User address
   * @return userAddress
  **/
  @ApiModelProperty(value = "User address")

@Size(min=1,max=50) 
  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }

  public UserModel password(String password) {
    this.password = password;
    return this;
  }

  /**
   * User password
   * @return password
  **/
  @ApiModelProperty(value = "User password")

@Size(min=6,max=12) 
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserModel email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address
   * @return email
  **/
  @ApiModelProperty(value = "Email address")

@Size(min=1,max=50) 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserModel userModel = (UserModel) o;
    return Objects.equals(this.userId, userModel.userId) &&
        Objects.equals(this.userName, userModel.userName) &&
        Objects.equals(this.userAddress, userModel.userAddress) &&
        Objects.equals(this.password, userModel.password) &&
        Objects.equals(this.email, userModel.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, userAddress, password, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserModel {\n");

    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userAddress: ").append(toIndentedString(userAddress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

