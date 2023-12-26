package com.brito.api.ws.education.exception;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String message){
        super(message);
    }
}
