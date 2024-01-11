package com.crud.hotel.exception;

/**
 * @author Asish Sutar
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
