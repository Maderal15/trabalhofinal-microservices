package com.microservices.trabalhofinal.excepetion;

public class TransactionException extends RuntimeException {
    public TransactionException(String message) {
        super(message);
    }
}