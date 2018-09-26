package com.microservice1.microservice1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * UserModel result.
 */
@ApiModel(description = "UserModel result.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-24T22:04:02.298-05:00")

public class UserModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("salary")
  private Long salary = null;

  public UserModel id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * UserModel id to return.
   * minimum: 1
   * maximum: 9999999999
   * @return id
  **/
  @ApiModelProperty(required = true, value = "UserModel id to return.")
  @NotNull

@Min(1) @Max(9999999999L)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * UserModel name to return.
   * @return name
  **/
  @ApiModelProperty(value = "UserModel name to return.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserModel salary(Long salary) {
    this.salary = salary;
    return this;
  }

  /**
   * salary to return.
   * minimum: 1
   * maximum: 9999999999
   * @return salary
  **/
  @ApiModelProperty(value = "salary to return.")

@Min(1) @Max(9999999999L)
  public Long getSalary() {
    return salary;
  }

  public void setSalary(Long salary) {
    this.salary = salary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserModel user = (UserModel) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.salary, user.salary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, salary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserModel {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
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

