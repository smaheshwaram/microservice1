package com.microservice1.microservice1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Post user Account data.
 */
@ApiModel(description = "Post user Account data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-26T20:53:10.828-06:00")

public class PostUserAccount  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("userAddress")
  private String userAddress = null;

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

  public PostUserAccount userAddress(String userAddress) {
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
        Objects.equals(this.password, postUserAccount.password) &&
        Objects.equals(this.userAddress, postUserAccount.userAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password, userAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUserAccount {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userAddress: ").append(toIndentedString(userAddress)).append("\n");
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

