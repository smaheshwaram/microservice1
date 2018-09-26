package com.microservice1.microservice1.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice1.microservice1.model.UsersModel;
import com.microservice1.microservice1.svc.Microservice1Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-24T22:07:10.306-05:00")

@Controller
public class Microservice1ApiController implements Microservice1Api {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final Microservice1Service microservice1Service;

    @Autowired(required = true)
    public Microservice1ApiController(ObjectMapper objectMapper, HttpServletRequest request, Microservice1Service microservice1Service) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.microservice1Service = microservice1Service;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @ApiOperation(value = "Get all users", nickname = "getAvailableUsers", notes = "Get all users", response = UsersModel.class, tags={ "microservice 1 test", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation", response = UsersModel.class),
            @ApiResponse(code = 404, message = "Incorrect data input") })
    @RequestMapping(value = "/microservice1/users/",
            produces = { "application/json" },
            method = RequestMethod.GET)
    @Override
    public ResponseEntity<UsersModel> getAvailableUsers() {
        try {
            final UsersModel users = microservice1Service.getAvailableUsers();
            return users == null ? new ResponseEntity(HttpStatus.NOT_FOUND) : new ResponseEntity(users, HttpStatus.OK);
        }
        catch (final Throwable e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
