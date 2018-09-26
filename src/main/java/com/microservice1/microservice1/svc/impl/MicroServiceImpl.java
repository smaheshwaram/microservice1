package com.microservice1.microservice1.svc.impl;

import com.microservice1.microservice1.dao.UsersMapper;
import com.microservice1.microservice1.dto.UsersExample;
import com.microservice1.microservice1.dto.Users;
import com.microservice1.microservice1.model.UserModel;
import com.microservice1.microservice1.model.UsersModel;
import com.microservice1.microservice1.svc.Microservice1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MicroServiceImpl implements Microservice1Service {

    @Autowired
    private UsersMapper usersMapper;


    @Override
    @Transactional( isolation = Isolation.DEFAULT, propagation = Propagation.SUPPORTS, readOnly = true,
            rollbackFor = Throwable.class )
    public UsersModel getAvailableUsers() throws Exception {
        final UsersModel users = new UsersModel();
        final UsersExample usersExample = new UsersExample();
        final List<Users> usersDto = usersMapper.selectByExample( usersExample );
        if (usersDto != null) {
            for (final Users user1 : usersDto) {
                users.addUsersItem(mapUserData(user1));
            }
        }
        else {
            throw new Exception( "No districts found" );
        }

        return users;
    }

    private UserModel mapUserData(final Users user) {
        final UserModel user1 = new UserModel();
        user1.id(user.getId().longValue())
                .name(user.getName())
                .salary(user.getSalary().longValue());

        return user1;
    }
}
