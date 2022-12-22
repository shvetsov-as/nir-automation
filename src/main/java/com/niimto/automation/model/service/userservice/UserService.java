package com.niimto.automation.model.service.userservice;

import com.niimto.automation.entity.user.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User createUser(User user);

    User findUserByLogin(String userLogin);

    void updateUser(User user);

    void deleteUser(String login);
}
