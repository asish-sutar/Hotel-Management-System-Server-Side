package com.crud.hotel.exception;

/**
 * @author Asish Sutar
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
