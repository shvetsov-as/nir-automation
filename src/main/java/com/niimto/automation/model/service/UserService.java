package com.niimto.automation.model.service;

import com.niimto.automation.entity.user.dto.UserDtoRequest;

public interface UserService {
    UserDtoRequest createUser (UserDtoRequest request);
}
