package com.microservices.trabalhofinal.excepetion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
  
    @ExceptionHandler(TransactionException.class)
    public final ResponseEntity<Object> handlerAll(Exception ex, WebRequest request) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    

}
