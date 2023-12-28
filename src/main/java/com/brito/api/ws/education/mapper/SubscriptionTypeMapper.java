package com.brito.api.ws.education.mapper;

import com.brito.api.ws.education.dto.SubscriptionTypeDto;
import com.brito.api.ws.education.model.SubscriptionType;

public class SubscriptionTypeMapper {

    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto subscriptionTypeDto){
        return SubscriptionType.builder()
                .id(subscriptionTypeDto.getId())
                .name(subscriptionTypeDto.getName())
                .accessMonths(subscriptionTypeDto.getAccessMonths())
                .price(subscriptionTypeDto.getPrice())
                .productKey(subscriptionTypeDto.getProductKey())
                .build();
    }
}
