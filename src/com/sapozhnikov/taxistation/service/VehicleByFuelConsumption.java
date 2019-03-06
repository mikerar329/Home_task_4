package com.sapozhnikov.taxistation.service;

import com.sapozhnikov.taxistation.domain.Vehicle;

import java.util.Comparator;

public class VehicleByFuelConsumption implements Comparator<Vehicle> {

    @Override
        public int compare(Vehicle vehicle1, Vehicle vehicle2) {
            if (vehicle1==null) return 1;
            if (vehicle2==null) return -1;
            return vehicle1.getFuelConsumption().compareTo(vehicle2.getFuelConsumption());
        }

}








