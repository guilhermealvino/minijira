package com.minijira.core.domain.exception;

public class InvalidTimeException extends RuntimeException {
    public InvalidTimeException(String message) {
        super(message);
    }
}