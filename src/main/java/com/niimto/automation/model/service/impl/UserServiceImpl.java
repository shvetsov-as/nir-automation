package com.niimto.automation.model.service.impl;

import com.niimto.automation.entity.user.User;
import com.niimto.automation.entity.user.dto.UserDtoRequest;
import com.niimto.automation.entity.user.dto.UserDtoResponse;
import com.niimto.automation.entity.user.mapper.UserMapper;
import com.niimto.automation.model.service.UserService;
import com.niimto.automation.model.service.sequencegen.UuidGen;
import com.niimto.automation.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UuidGen uuidGen;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper, UuidGen uuidGen) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.uuidGen = uuidGen;
    }

    @Override
    public List<UserDtoResponse> findAll() {
        return null;
    }

    @Override
    public UserDtoResponse createUser(UserDtoRequest request) {

        User user = userMapper.userDtoRequestToUser(request);
        System.out.println(request.toString());

        user.setUserId(uuidGen.getId());
        System.out.println(user);
        user = userRepository.save(user);

        return userMapper.userToUserDtoResponse(user);
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
