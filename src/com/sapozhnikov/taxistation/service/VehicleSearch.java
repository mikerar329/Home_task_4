package com.sapozhnikov.taxistation.service;

import com.sapozhnikov.taxistation.domain.Manufacturer;
import com.sapozhnikov.taxistation.domain.Model;
import com.sapozhnikov.taxistation.domain.Vehicle;

import java.util.Iterator;
import java.util.List;

public class VehicleSearch {

    public static List<Vehicle> searchByYear(Integer min,
                                             Integer max,
                                             List<Vehicle> vehicleList) {
        if (min > max) {
            Integer temp = max;
            max = min;
            min = temp;
        }
        Iterator<Vehicle> vehicleIterator = vehicleList.iterator();
        while (vehicleIterator.hasNext()) {
            Vehicle next = vehicleIterator.next();
            if (next.getYear() < min || next.getYear() > max)
                vehicleIterator.remove();
        }

        return vehicleList;
    }

    public static List<Vehicle> searchByMileage(Integer min,
                                                Integer max,
                                                List<Vehicle> vehicleList) {
        if (min > max) {
            Integer temp = max;
            max = min;
            min = temp;
        }
        Iterator<Vehicle> vehicleIterator = vehicleList.iterator();
        while (vehicleIterator.hasNext()) {
            Vehicle next = vehicleIterator.next();
            if (next.getMileage() < min || next.getMileage() > max)
                vehicleIterator.remove();
        }
        return vehicleList;
    }

    public static List<Vehicle> searchByPrice(Integer min,
                                              Integer max,
                                              List<Vehicle> vehicleList) {
        if (min > max) {
            Integer temp = max;
            max = min;
            min = temp;
        }
        Iterator<Vehicle> vehicleIterator = vehicleList.iterator();
        while (vehicleIterator.hasNext()) {
            Vehicle next = vehicleIterator.next();
            if (next.getPrice() < min || next.getPrice() > max)
                vehicleIterator.remove();
        }
        return vehicleList;
    }

    public static List<Vehicle> searchByFuelConsumption(Integer min,
                                                        Integer max,
                                                        List<Vehicle> vehicleList) {
        if (min > max) {
            Integer temp = max;
            max = min;
            min = temp;
        }
        Iterator<Vehicle> vehicleIterator = vehicleList.iterator();
        while (vehicleIterator.hasNext()) {
            Vehicle next = vehicleIterator.next();
            if (next.getFuelConsumption() < min || next.getFuelConsumption() > max)
                vehicleIterator.remove();
        }
        return vehicleList;
    }

    public static List<Vehicle> searchByManufacturer(Manufacturer manufacturer,
                                                     List<Vehicle> vehicleList) {

        Iterator<Vehicle> vehicleIterator = vehicleList.iterator();
        while (vehicleIterator.hasNext()) {
            Vehicle next = vehicleIterator.next();
            if (next.getManufacturer() != manufacturer)
                vehicleIterator.remove();
        }
        return vehicleList;
    }

    public static List<Vehicle> searchByModel(Model model,
                                              List<Vehicle> vehicleList) {

        Iterator<Vehicle> vehicleIterator = vehicleList.iterator();
        while (vehicleIterator.hasNext()) {
            Vehicle next = vehicleIterator.next();
            if (next.getModel() != model)
                vehicleIterator.remove();
        }
        return vehicleList;
    }
}