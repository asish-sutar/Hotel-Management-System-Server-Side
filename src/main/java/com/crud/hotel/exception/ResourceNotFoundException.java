package com.crud.hotel.exception;

/**
 * @author Asish Sutar
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
