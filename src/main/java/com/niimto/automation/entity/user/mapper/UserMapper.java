package com.niimto.automation.entity.user.mapper;

import com.niimto.automation.entity.user.User;
import com.niimto.automation.entity.user.dto.UserDtoRequest;
import com.niimto.automation.entity.user.dto.UserDtoResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User userDtoRequestToUser(UserDtoRequest userDtoRequest);
    UserDtoResponse userToUserDtoResponse(User user);

    List<UserDtoResponse> userListToUserDtoResponseList(List<User> userList);
}
