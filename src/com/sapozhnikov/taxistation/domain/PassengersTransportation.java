package com.sapozhnikov.taxistation.domain;

import com.sapozhnikov.taxistation.exception.VehicleSeatsCountException;

public interface PassengersTransportation {

    boolean addPassenger(Integer numPassengers) throws VehicleSeatsCountException;

    Integer getPassengerCount();
    
}
