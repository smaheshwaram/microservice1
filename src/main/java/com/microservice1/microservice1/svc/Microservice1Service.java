package com.microservice1.microservice1.svc;

import com.microservice1.microservice1.model.UsersModel;

public interface Microservice1Service {

    UsersModel getAvailableUsers() throws Exception;
}
