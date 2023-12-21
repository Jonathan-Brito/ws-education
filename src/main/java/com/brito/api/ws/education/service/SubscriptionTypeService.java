package com.brito.api.ws.education.service;

import com.brito.api.ws.education.model.SubscriptionType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionType subscriptionType);

    SubscriptionType update(Long id, SubscriptionType subscriptionType);

    void delete(Long id);
}
