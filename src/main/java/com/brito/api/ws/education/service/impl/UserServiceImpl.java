package com.brito.api.ws.education.service.impl;

import com.brito.api.ws.education.dto.UserDto;
import com.brito.api.ws.education.exception.BadRequestException;
import com.brito.api.ws.education.exception.NotFoundException;
import com.brito.api.ws.education.mapper.UserMapper;
import com.brito.api.ws.education.model.User;
import com.brito.api.ws.education.model.UserType;
import com.brito.api.ws.education.repository.UserRepository;
import com.brito.api.ws.education.repository.UserTypeRepository;
import com.brito.api.ws.education.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserTypeRepository userTypeRepository;

    public UserServiceImpl(final UserRepository userRepository, final UserTypeRepository userTypeRepository){
        this.userRepository = userRepository;
        this.userTypeRepository = userTypeRepository;
    }
    @Override
    public User create(UserDto userDto) {
        if (Objects.nonNull(userDto.getId())){
            throw new BadRequestException("id deve ser nulo");
        }

        var userTypeOpt = userTypeRepository.findById(userDto.getUserTypeId());

        if (userTypeOpt.isEmpty()){
            throw new NotFoundException("userTypeId não encontrado");
        }

        UserType userType = userTypeOpt.get();
        User user = UserMapper.fromDtoToEntity(userDto, userType, null);

        return userRepository.save(user);
    }
}
