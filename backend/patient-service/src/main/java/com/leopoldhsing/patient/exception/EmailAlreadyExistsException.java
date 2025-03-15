package com.leopoldhsing.patient.exception;

public class EmailAlreadyExistsException extends RuntimeException {
    private static final String defaultMessage = "A patient with email %s already exists";

    public EmailAlreadyExistsException(String email) {
        super(String.format(defaultMessage, email));
    }
}
