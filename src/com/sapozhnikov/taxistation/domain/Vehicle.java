package com.sapozhnikov.taxistation.domain;

import java.io.Serializable;

abstract public class Vehicle implements Serializable {
    private Manufacturer manufacturer;
    private Model model;
    private Integer year;
    private Integer price;
    private Integer mileage;
    private Double fuelConsumption; // liters per 100km

    public Vehicle() {
    }

    public Vehicle(Manufacturer manufacturer,
                   Model model, Integer year,
                   Integer price, Integer mileage,
                   Double fuelConsumption) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.fuelConsumption = fuelConsumption;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "manufacturer = " + manufacturer +
                ", model = " + model +
                ", year = " + year +
                ", price = " + price +
                ", mileage = " + mileage +
                ", fuelConsumption = " + fuelConsumption;
    }
}
