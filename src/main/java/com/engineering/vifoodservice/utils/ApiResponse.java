package com.engineering.vifoodservice.utils;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;


@Builder
public class ApiResponse {

    private ZonedDateTime timeStamp;
    private Boolean isSuccessful;
    private HttpStatus httpStatus;
    private Object path;
    private String data;

    public ApiResponse(ZonedDateTime timeStamp,Boolean isSuccessful,HttpStatus httpStatus,Object path,String data){
        this.timeStamp = timeStamp;
        this.isSuccessful = isSuccessful;
        this.httpStatus = httpStatus;
        this.path = path;
        this.data = data;
    }
    public ZonedDateTime getTimeStamp(){
        return timeStamp;
    }
    public Boolean getIsSuccessful(){
        return isSuccessful;
    }
    public HttpStatus getHttpStatus(){
        return httpStatus;
    }
    public Object getPath(){
        return path;
    }
    public String getData(){
        return data;
    }
    public void setTimeStamp(ZonedDateTime timeStamp){
        this.timeStamp = timeStamp;
    }
    public void setIsSuccessful(Boolean isSuccessful){
        this.isSuccessful= isSuccessful;
    }
    public void setHttpStatus(HttpStatus httpStatus){
        this.httpStatus = httpStatus;
    }
    public void setPath(Object path){
        this.path = path;
    }
    public void setData(String data){
        this.data = data;
    }

}
