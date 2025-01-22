package com.establishment.api.driver.controller.advice;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.establishment.api.domain.exception.EstablishmentNotFoundException;
import com.establishment.api.domain.exception.InvalidEstablishmentAttribute;

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

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<Object> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex) {
        String errors = "Invalid argument type: " + ex.getName() +
                         " | Expected: " + ex.getRequiredType().getSimpleName() +
                         " | Provided: " + ex.getValue();
        return new ResponseEntity<>("MethodArgumentTypeMismatchException: " + errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<Object> handleMissingServletRequestParameterException(MissingServletRequestParameterException ex) {
        String errors = ex.getMessage();
        return new ResponseEntity<>("MissingServletRequestParameterException: " + errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<Object> handleNumberFormatException(NumberFormatException ex) {
        String errors = ex.getMessage();
        return new ResponseEntity<>("NumberFormatException: " + errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidEstablishmentAttribute.class)
    public ResponseEntity<Object> handleInvalidEstablishmentAttribute(InvalidEstablishmentAttribute ex) {
        String errors = ex.getMessage();
        return new ResponseEntity<>("InvalidEstablishmentAttribute: " + errors, HttpStatus.BAD_REQUEST);
    }
}
