package com.niimto.automation.model.service.userservice;

import com.niimto.automation.entity.user.User;
import com.niimto.automation.model.service.sequencegen.UuidGen;
import com.niimto.automation.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UuidGen uuidGen;

    public UserServiceImpl(UserRepository userRepository, UuidGen uuidGen) {
        this.userRepository = userRepository;
        this.uuidGen = uuidGen;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        user.setUserId(uuidGen.getId());
        return userRepository.save(user);
    }

    @Override
    public User findUserByLogin(String userLogin) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(String login) {

    }
}
