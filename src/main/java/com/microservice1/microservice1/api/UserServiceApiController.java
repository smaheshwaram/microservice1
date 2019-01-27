package com.microservice1.microservice1.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice1.microservice1.model.Users;
import com.microservice1.microservice1.svc.UserServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
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
}
