package com.niimto.automation.model.facade.userfacade;

import com.niimto.automation.entity.user.User;
import com.niimto.automation.entity.user.dto.UserDtoRequest;
import com.niimto.automation.entity.user.dto.UserDtoResponse;
import com.niimto.automation.entity.user.mapper.UserMapper;
import com.niimto.automation.model.service.userservice.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFacadeImpl implements UserFacade{

    private final UserService userService;
    private final UserMapper userMapper;

    public UserFacadeImpl(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDtoResponse> findAll() {
        return userMapper.userListToUserDtoResponseList(userService.findAll());
    }

    @Override
    public UserDtoResponse createUser (UserDtoRequest request) {
        User user = userMapper.userDtoRequestToUser(request);
        return  userMapper.userToUserDtoResponse(userService.createUser(user));
    }

    @Override
    public UserDtoResponse findUserByLogin(String userLogin) {
        return null;
    }

    @Override
    public void updateUser(UserDtoRequest request) {

    }

    @Override
    public void deleteUser(String login) {

    }
}
