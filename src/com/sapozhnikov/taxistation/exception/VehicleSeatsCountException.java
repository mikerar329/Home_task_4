package com.sapozhnikov.taxistation.exception;

public class VehicleSeatsCountException extends Exception{
    public VehicleSeatsCountException() {
    }

    public VehicleSeatsCountException(String message) {
        super(message);
    }

    public VehicleSeatsCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public VehicleSeatsCountException(Throwable cause) {
        super(cause);
    }
}
