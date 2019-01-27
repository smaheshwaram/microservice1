package com.microservice1.microservice1.svc.impl;

import com.microservice1.microservice1.dao.UserAccountMapper;
import com.microservice1.microservice1.dto.UserAccount;
import com.microservice1.microservice1.dto.UserAccountExample;
import com.microservice1.microservice1.model.PostUserAccount;
import com.microservice1.microservice1.model.UserModel;
import com.microservice1.microservice1.model.Users;
import com.microservice1.microservice1.svc.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInterface {

    @Autowired
    private UserAccountMapper userAccountMapper;


    @Override
    @Transactional( isolation = Isolation.DEFAULT, propagation = Propagation.SUPPORTS, readOnly = true,
            rollbackFor = Throwable.class )
    public Users getAvailableUsers() throws Exception {
        final Users users = new Users();
        final UserAccountExample usersExample = new UserAccountExample();
        final List<UserAccount> userAccounts = userAccountMapper.selectByExample( usersExample );
        if (userAccounts != null) {
            for (final UserAccount userAccount : userAccounts) {
                users.addUsersItem(mapUserData(userAccount));
            }
        }
        else {
            throw new Exception( "No users found" );
        }

        return users;
    }

    @Override
    @Transactional( isolation = Isolation.DEFAULT, propagation = Propagation.SUPPORTS, readOnly = true,
            rollbackFor = Throwable.class )
    public UserModel postUser(final PostUserAccount postUserAccount) {
        final UserAccount userAccount = new UserAccount();
        if (postUserAccount != null) {
            userAccount.withUserName(postUserAccount.getUserName());
            userAccount.withPassword(postUserAccount.getPassword());
            if (postUserAccount.getUserAddress() != null) {
                userAccount.withAddress(postUserAccount.getUserAddress());
            }
            userAccountMapper.insert(userAccount);
            return mapUserModel(userAccount);
        }
        return new UserModel();
    }

    private UserModel mapUserModel(UserAccount userAccount) {
        UserModel userModel = new UserModel();
        userModel.setUserName(userAccount.getUserName());
        userModel.setPassword(userAccount.getPassword());
        userModel.setUserAddress(userAccount.getAddress());
        userModel.setUserId(userAccount.getUserid().longValue());

        return userModel;
    }

    private UserModel mapUserData(final UserAccount user) {
        final UserModel userModel = new UserModel();
        userModel.userId(user.getUserid().longValue())
                .userName(user.getUserName())
                .userAddress(user.getAddress())
                .password(user.getPassword());

        return userModel;
    }
}
