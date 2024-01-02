package com.brito.api.ws.education.mapper;

import com.brito.api.ws.education.dto.UserDto;
import com.brito.api.ws.education.model.SubscriptionType;
import com.brito.api.ws.education.model.User;
import com.brito.api.ws.education.model.UserType;

public class UserMapper {

    public static User fromDtoToEntity(UserDto userDto, UserType userType, SubscriptionType subscriptionType){
        return User.builder()
                .id(userDto.getId())
                .name(userDto.getName())
                .cpf(userDto.getCpf())
                .email(userDto.getEmail())
                .phone(userDto.getPhone())
                .dtSubscription(userDto.getDtSubscription())
                .dtExpiration(userDto.getDtExpiration())
                .userType(userType)
                .subscriptionType(subscriptionType)
                .build();
    }
}
