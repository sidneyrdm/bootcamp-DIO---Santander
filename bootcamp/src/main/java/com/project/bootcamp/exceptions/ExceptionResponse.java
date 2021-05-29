package com.project.bootcamp.exceptions;

public class ExceptionResponse {

    public ExceptionResponse(String message){
        this.message= message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

}
