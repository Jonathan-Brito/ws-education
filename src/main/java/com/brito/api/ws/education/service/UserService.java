package com.brito.api.ws.education.service;

import com.brito.api.ws.education.dto.UserDto;
import com.brito.api.ws.education.model.User;

public interface UserService {

    User create(UserDto userDto);
}
