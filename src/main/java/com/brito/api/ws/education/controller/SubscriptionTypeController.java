package com.brito.api.ws.education.controller;

import com.brito.api.ws.education.dto.SubscriptionTypeDto;
import com.brito.api.ws.education.model.SubscriptionType;
import com.brito.api.ws.education.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {
    @Autowired
    private SubscriptionTypeService subscriptionTypeService;

    @GetMapping
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionType> findbyId(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<SubscriptionType> create(@RequestBody SubscriptionTypeDto subscriptionTypeDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(subscriptionTypeService.create(subscriptionTypeDto));
    }


}
