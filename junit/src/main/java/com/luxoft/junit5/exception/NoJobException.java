package com.luxoft.junit5.exception;

public class NoJobException extends RuntimeException {
    NoJobException(String message) {
        super( message );
    }
}
