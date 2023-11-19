package org.parking;

import org.parking.models.*;
import org.parking.enums.*;
import org.parking.exceptions.*;

public class Main {
    public static void createCarAndPark(Garage garage, VehicleFactory factory, String name, String regNum) throws SpaceNotFoundException {
        Vehicle car = factory.createCar(name, regNum);
        car.startEngine();
        garage.parkHere(car);
    }
    public static void main(String[] args) throws SpaceNotFoundException {
        VehicleFactory oldFactory = new OldVehicleFactory();
        VehicleFactory newFactory = new NewVehicleFactory();
        RandomVehicleFactory factory = new RandomVehicleFactory(oldFactory, newFactory);


        ParkingSpace[] spacesForFloor1 = {
            new ParkingSpace(Size.SMALL),
            new ParkingSpace(Size.SMALL),
            new ParkingSpace(Size.SMALL)
        };
        ParkingSpace[] spacesForFloor2 = {
            new ParkingSpace(Size.SMALL),
            new ParkingSpace(Size.SMALL),
            new ParkingSpace(Size.SMALL)
        };

        Floor[] floors = {
            new Floor(spacesForFloor1),
            new Floor(spacesForFloor2)
        };

        Garage garage = new Garage(floors);
        createCarAndPark(garage, factory, "Peugeot 206", "1234AB");
        createCarAndPark(garage, factory, "Tesla", "7654HY");
        createCarAndPark(garage, factory, "Honda", "3951KD");
        createCarAndPark(garage, factory, "Vauxhall", "2254JA");
        createCarAndPark(garage, factory, "Kia", "4462IH");

    }
}