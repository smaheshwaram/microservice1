package com.microservice1.microservice1.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice1.microservice1.model.PostUserAccount;
import com.microservice1.microservice1.model.UserModel;
import com.microservice1.microservice1.model.Users;
import com.microservice1.microservice1.svc.UserServiceInterface;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-26T17:44:18.720-06:00")

@Controller
public class UserServiceApiController implements UserServiceApi {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final UserServiceInterface userServiceInterface;

    @org.springframework.beans.factory.annotation.Autowired
    public UserServiceApiController(ObjectMapper objectMapper, HttpServletRequest request, UserServiceInterface userServiceInterface) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.userServiceInterface = userServiceInterface;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Users> getAvailableUsers() {
        try {
            final Users users = userServiceInterface.getAvailableUsers();
            return users == null ? new ResponseEntity(HttpStatus.NOT_FOUND) : new ResponseEntity(users, HttpStatus.OK);
        } catch (final Throwable e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<UserModel> postUser(@ApiParam(value = "") @Valid @RequestBody PostUserAccount body) {
        try {
            final UserModel userModel = userServiceInterface.postUser(body);
            return userModel == null ? new ResponseEntity(HttpStatus.NOT_FOUND) : new ResponseEntity(userModel, HttpStatus.OK);
        } catch (final Throwable e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<UserModel> validateUser(@Size(min=1,max=30) @ApiParam(value = "User name",required=true)
                                                      @PathVariable("userName") final String userName, @NotNull @Size(min=6,max=12)
    @ApiParam(value = "User password", required = true) @Valid @RequestParam(value = "password", required = true) final String password) {
        try {
            final UserModel userModel = userServiceInterface.validateUser(userName, password);
            return userModel == null ? new ResponseEntity(HttpStatus.NOT_FOUND) : new ResponseEntity(userModel, HttpStatus.OK);
        } catch (final Throwable e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
