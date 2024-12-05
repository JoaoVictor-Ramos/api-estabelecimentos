package com.establishment.api.domain.exception;

public class EstablishmentNotFoundException extends RuntimeException {
    public EstablishmentNotFoundException(String msg) {
        super(msg);
    }
}
