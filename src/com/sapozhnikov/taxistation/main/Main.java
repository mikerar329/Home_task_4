package com.sapozhnikov.taxistation.main;

import com.sapozhnikov.taxistation.domain.Manufacturer;
import com.sapozhnikov.taxistation.domain.Model;
import com.sapozhnikov.taxistation.domain.Vehicle;
import com.sapozhnikov.taxistation.domain.impl.Car;
import com.sapozhnikov.taxistation.domain.impl.Truck;
import com.sapozhnikov.taxistation.domain.impl.Van;
import com.sapozhnikov.taxistation.service.VehicleByFuelConsumption;
import com.sapozhnikov.taxistation.service.VehicleSearch;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Double totalCost = 0.0;
        List<Vehicle> vehicles = new LinkedList<>();
        File file = new File("file.txt");
        List<String> strings = new ArrayList<String>();
        Scanner sc;

        try {

            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                //.trim() осуществляет обрезание пробелов
                strings.add(line);
                System.out.println(line); //печать строки в стандартный вывод
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        vehicles.add(new Car(
                Manufacturer.BMW,
                Model.X5,
                2005,
                14000,
                248000,
                18.2,
                5,
                1));
        System.out.println(vehicles.get(0));
//        FileOutputStream fileOut = new FileOutputStream("D:/Java_Labs/Epam_Homework/src/com/sapozhnikov/taxistation/service/Obj.txt");
        vehicles.add(new Car(
                Manufacturer.LADA,
                Model.KALINA,
                2002,
                3500,
                748000,
                7.4,
                5,
                2));
        vehicles.add(new Van(
                Manufacturer.VOLKSWAGEN,
                Model.TRANSPORTER,
                2008,
                8900,
                348000,
                6.5,
                9,
                4,
                6,
                3));
        vehicles.add(new Truck(
                Manufacturer.IVECO,
                Model.MASSIF,
                2006,
                12500,
                112000,
                13.4,
                6,
                3));
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
            totalCost += v.getPrice();
        }
        System.out.println(" Sorted by Fuel Consumption:");
        vehicles.sort(new VehicleByFuelConsumption());
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
        System.out.println(" Total cost is: " + totalCost);
        VehicleSearch.searchByYear(2009, 2004, vehicles);
        VehicleSearch.searchByMileage(200000, 350000, vehicles);

        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
    }
}
