package com.sapozhnikov.taxistation.exception;

public class VehicleCargoPlacesException extends Exception{
    public VehicleCargoPlacesException() {
    }

    public VehicleCargoPlacesException(String message) {
        super(message);
    }

    public VehicleCargoPlacesException(String message, Throwable cause) {
        super(message, cause);
    }

    public VehicleCargoPlacesException(Throwable cause) {
        super(cause);
    }
}
