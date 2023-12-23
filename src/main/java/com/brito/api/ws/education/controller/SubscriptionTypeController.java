package com.brito.api.ws.education.controller;

import com.brito.api.ws.education.exception.NotFoundException;
import com.brito.api.ws.education.model.SubscriptionType;
import com.brito.api.ws.education.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {
    @Autowired
    private SubscriptionTypeService subscriptionTypeService;

    @GetMapping("/teste")
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionType> findbyId(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findById(id));
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> notfoundException(NotFoundException e){
        String errorMessage = e.getMessage();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }


}
