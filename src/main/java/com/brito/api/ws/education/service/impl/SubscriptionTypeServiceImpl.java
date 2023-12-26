package com.brito.api.ws.education.service.impl;

import com.brito.api.ws.education.dto.SubscriptionTypeDto;
import com.brito.api.ws.education.exception.BadRequestException;
import com.brito.api.ws.education.exception.NotFoundException;
import com.brito.api.ws.education.model.SubscriptionType;
import com.brito.api.ws.education.repository.SubscriptionTypeRepository;
import com.brito.api.ws.education.service.SubscriptionTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    private final SubscriptionTypeRepository subscriptionTypeRepository;

    public SubscriptionTypeServiceImpl(SubscriptionTypeRepository subscriptionTypeRepository){
        this.subscriptionTypeRepository = subscriptionTypeRepository;
    }
    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {
        Optional<SubscriptionType> optionalSubscriptionType = subscriptionTypeRepository.findById(id);
        if (optionalSubscriptionType.isEmpty()){
            throw new NotFoundException("SubscriptionType não encontrado");
        }
        return optionalSubscriptionType.get();
    }

    @Override
    public SubscriptionType create(SubscriptionTypeDto subscriptionTypeDto) {
        if (Objects.nonNull(subscriptionTypeDto.getId())){
            throw new BadRequestException("Id deve ser nulo");
        }

        return subscriptionTypeRepository.save(SubscriptionType.builder()
                        .id(subscriptionTypeDto.getId())
                        .name(subscriptionTypeDto.getName())
                        .accessMonths(subscriptionTypeDto.getAccessMonths())
                        .price(subscriptionTypeDto.getPrice())
                        .productKey(subscriptionTypeDto.getProductKey())
                .build());
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionType subscriptionType) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
