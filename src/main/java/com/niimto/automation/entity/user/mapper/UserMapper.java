package com.niimto.automation.entity.user.mapper;

import com.niimto.automation.entity.user.User;
import com.niimto.automation.entity.user.dto.UserDtoRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User userDtoRequestToUser(UserDtoRequest userDtoRequest);
    UserDtoRequest userToUserDtoRequest(User user);
}
