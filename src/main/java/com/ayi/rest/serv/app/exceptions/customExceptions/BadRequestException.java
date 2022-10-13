package com.ayi.rest.serv.app.exceptions.customExceptions;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message) {
        super(message);
    }
}
