package com.sapozhnikov.taxistation.domain.impl;

import com.sapozhnikov.taxistation.domain.Manufacturer;
import com.sapozhnikov.taxistation.domain.Model;
import com.sapozhnikov.taxistation.domain.PassengersTransportation;
import com.sapozhnikov.taxistation.domain.Vehicle;
import com.sapozhnikov.taxistation.exception.VehicleSeatsCountException;

public class Car extends Vehicle implements PassengersTransportation {

    private Integer numberOfSeats;
    private Integer currentPassengersCount;

    public Car(Integer numberOfSeats,
               Integer currentPassengersCount) {
        this.numberOfSeats = numberOfSeats;
        this.currentPassengersCount = currentPassengersCount;
    }

    public Car(Manufacturer manufacturer,
               Model model,
               Integer year,
               Integer price,
               Integer mileage,
               Double fuelConsumption,
               Integer numberOfSeats,
               Integer currentPassengersCount) {
        super(manufacturer,
                model,
                year,
                price,
                mileage,
                fuelConsumption);
        this.numberOfSeats = numberOfSeats;
        this.currentPassengersCount = currentPassengersCount;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getCurrentPassengersCount() {
        return currentPassengersCount;
    }

    public void setCurrentPassengersCount(Integer currentPassengersCount) {
        this.currentPassengersCount = currentPassengersCount;
    }

    @Override
    public boolean addPassenger(Integer numPassengers) throws VehicleSeatsCountException {
        if (numPassengers < (currentPassengersCount - numberOfSeats)) {
            currentPassengersCount += numPassengers;
            return true;
        } else {
            throw new VehicleSeatsCountException("Not enough free seats.");
        }

    }

    @Override
    public Integer getPassengerCount() {

        return currentPassengersCount;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numberOfSeats = " + numberOfSeats +
                ", currentPassengersCount = " + currentPassengersCount;
    }
}
