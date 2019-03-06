package com.sapozhnikov.taxistation.main;

import com.sapozhnikov.taxistation.domain.Vehicle;
import com.sapozhnikov.taxistation.service.VehicleByFuelConsumption;
import com.sapozhnikov.taxistation.service.VehicleSearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double totalCost = 0.0;
        List<Vehicle> vehicles = new LinkedList<>();
        File file = new File("D:\\Java_Labs\\Epam_Homework\\src\\com\\sapozhnikov\\taxistation\\service\\Obj.txt");
        Scanner sc;

        try {

            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                vehicles.add(Vehicle.parseVehicle(line));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
            totalCost += v.getPrice();
        }
        System.out.println(" Total cost is: " + totalCost + "\n");
        System.out.println(" Sorted by Fuel Consumption:");
        vehicles.sort(new VehicleByFuelConsumption());
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
        System.out.println("\nSorted by parameters range:");
        VehicleSearch.searchByYear(2009, 2004, vehicles);
        VehicleSearch.searchByMileage(200000, 350000, vehicles);

        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
    }
}
