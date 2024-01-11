package com.crud.hotel.exception;

/**
 * @author Asish Sutar
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
