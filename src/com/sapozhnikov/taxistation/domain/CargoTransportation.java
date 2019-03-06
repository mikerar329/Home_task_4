package com.sapozhnikov.taxistation.domain;

import com.sapozhnikov.taxistation.exception.VehicleCargoPlacesException;

public interface CargoTransportation {

    boolean addCargo(Integer numberOfCargo) throws VehicleCargoPlacesException;

    Integer getCargoCount();

}
