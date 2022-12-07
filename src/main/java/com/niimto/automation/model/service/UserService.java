package com.niimto.automation.model.service;

import com.niimto.automation.entity.user.dto.UserDtoRequest;
import com.niimto.automation.entity.user.dto.UserDtoResponse;

import java.util.List;

public interface UserService {

    List<UserDtoResponse> findAll();
    UserDtoResponse createUser(UserDtoRequest request);

    UserDtoResponse findUserByLogin(String userLogin);

    void updateUser(UserDtoRequest request);

    void deleteUser(String login);
}
