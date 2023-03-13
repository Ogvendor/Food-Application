package com.engineering.vifoodservice.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class MealException extends RuntimeException{
    public MealException(String message){
        super(message);
    }
}
