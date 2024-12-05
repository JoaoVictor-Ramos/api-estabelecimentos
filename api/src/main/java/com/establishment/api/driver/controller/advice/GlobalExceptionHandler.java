package com.establishment.api.driver.controller.advice;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.establishment.api.domain.exception.EstablishmentNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IOException.class)
    public ResponseEntity<Object> handleIOException(IOException ex) {
        String errors = ex.getMessage();
        return new ResponseEntity<>("IOException: " + errors, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(EstablishmentNotFoundException.class)
    public ResponseEntity<Object> handleEstablishmentNotFoundException(EstablishmentNotFoundException ex) {
        String errors = ex.getMessage();
        return new ResponseEntity<>("EstablishmentNotFoundException: " + errors, HttpStatus.BAD_REQUEST);
    }
}
