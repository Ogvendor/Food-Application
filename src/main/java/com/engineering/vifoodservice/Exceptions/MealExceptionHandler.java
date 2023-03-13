package com.engineering.vifoodservice.Exceptions;

import com.engineering.vifoodservice.utils.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class MealExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<?> apiMealExceptionHandler(MealException mealException,
                                                                 HttpServletRequest httpServletRequest){

        ApiResponse apiResponse = ApiResponse.builder()
                .timeStamp(ZonedDateTime.now())
                .isSuccessful(false)
                .data(mealException.getMessage())
                .httpStatus(HttpStatus.CONFLICT)
                .path(httpServletRequest.getRequestURI()).build();

        return new ResponseEntity<>(apiResponse,HttpStatus.CONFLICT);
    }
    @ExceptionHandler
    public ResponseEntity<?> apiMealExceptionHandler(MealNotFoundException mealNotFoundException,
                                                     HttpServletRequest httpServletRequest){

        ApiResponse apiResponse = ApiResponse.builder()
                .timeStamp(ZonedDateTime.now())
                .isSuccessful(false)
                .data(mealNotFoundException.getMessage())
                .httpStatus(HttpStatus.NOT_FOUND)
                .path(httpServletRequest.getRequestURI()).build();

        return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);
    }



}
