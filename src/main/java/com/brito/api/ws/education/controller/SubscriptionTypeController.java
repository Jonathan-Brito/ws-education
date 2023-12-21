package com.brito.api.ws.education.controller;

import com.brito.api.ws.education.model.SubscriptionType;
import com.brito.api.ws.education.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/SubscriptionType")
public class SubscriptionTypeController {
    @Autowired
    private SubscriptionTypeService subscriptionTypeService;

    @GetMapping("/teste")
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll());
    }
}
