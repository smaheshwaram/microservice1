package com.microservice1.microservice1.svc;

import com.microservice1.microservice1.model.Users;

public interface UserServiceInterface {

    Users getAvailableUsers() throws Exception;
}
