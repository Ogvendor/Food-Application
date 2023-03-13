package com.engineering.vifoodservice.Exceptions;

public class MealNotFoundException extends RuntimeException{
    public MealNotFoundException(String message){
        super(message);
    }
}
