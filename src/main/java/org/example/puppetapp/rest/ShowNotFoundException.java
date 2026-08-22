package org.example.puppetapp.rest;

public class ShowNotFoundException extends RuntimeException{

    public ShowNotFoundException(String message) {
        super(message);
    }

    public ShowNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShowNotFoundException(Throwable cause) {
        super(cause);
    }
}
