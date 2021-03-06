/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.microservice1.microservice1.api;

import com.microservice1.microservice1.model.PostUserAccount;
import com.microservice1.microservice1.model.UserModel;
import com.microservice1.microservice1.model.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.IOException;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-30T19:12:03.962-06:00")

@Api(value = "userService", description = "the userService API")
public interface UserServiceApi {

    Logger log = LoggerFactory.getLogger(UserServiceApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Get all users", nickname = "getAvailableUsers", notes = "Get all users", response = Users.class, tags={ "User", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation", response = Users.class),
            @ApiResponse(code = 404, message = "Incorrect data input") })
    @RequestMapping(value = "/userService/users/",
            produces = { "application/json" },
            method = RequestMethod.GET)
    default ResponseEntity<Users> getAvailableUsers() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"users\" : [ {    \"userAddress\" : \"userAddress\",    \"password\" : \"password\",    \"userName\" : \"userName\",    \"userId\" : 800828191,    \"email\" : \"email\"  }, {    \"userAddress\" : \"userAddress\",    \"password\" : \"password\",    \"userName\" : \"userName\",    \"userId\" : 800828191,    \"email\" : \"email\"  } ]}", Users.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserServiceApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Post given user name and password", nickname = "postUser", notes = "Create a new user", response = UserModel.class, tags={ "User", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation", response = UserModel.class),
            @ApiResponse(code = 404, message = "Incorrect data input") })
    @RequestMapping(value = "/userService/users/",
            produces = { "application/json" },
            method = RequestMethod.POST)
    default ResponseEntity<UserModel> postUser(@ApiParam(value = ""  )  @Valid @RequestBody PostUserAccount body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"userAddress\" : \"userAddress\",  \"password\" : \"password\",  \"userName\" : \"userName\",  \"userId\" : 800828191,  \"email\" : \"email\"}", UserModel.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserServiceApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "Validate user", nickname = "validateUser", notes = "Validate user", response = UserModel.class, tags={ "User", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation", response = UserModel.class),
            @ApiResponse(code = 404, message = "Incorrect user data input") })
    @RequestMapping(value = "/userService/users/{userName}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    default ResponseEntity<UserModel> validateUser(@Size(min=1,max=30) @ApiParam(value = "User name",required=true) @PathVariable("userName") String userName, @NotNull @Size(min=6,max=12) @ApiParam(value = "User password", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"userAddress\" : \"userAddress\",  \"password\" : \"password\",  \"userName\" : \"userName\",  \"userId\" : 800828191,  \"email\" : \"email\"}", UserModel.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserServiceApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
