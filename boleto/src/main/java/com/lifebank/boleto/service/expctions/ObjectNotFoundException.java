package com.lifebank.boleto.service.expctions;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String s) {
        super(s);
    }

    public ObjectNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }
}