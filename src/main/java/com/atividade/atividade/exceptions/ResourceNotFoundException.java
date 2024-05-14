package com.atividade.atividade.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException(String msg) {
        super(msg);
    }

}
