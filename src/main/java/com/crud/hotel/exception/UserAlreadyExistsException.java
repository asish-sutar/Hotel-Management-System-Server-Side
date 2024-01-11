package com.crud.hotel.exception;

/**
 * @author Asish Sutar
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
