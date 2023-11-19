package org.parking;

import org.parking.models.*;
import org.parking.enums.*;
import org.parking.exceptions.*;

public class Main {

    public static void createCarAndPark(Garage garage, VehicleFactory factory, String name, String regNum) throws SpaceNotFoundException {
        Car car = factory.createCar(name, regNum);
        car.startEngine();
        garage.parkHere(car);
    }
    public static void main(String[] args) throws SpaceNotFoundException {
        VehicleFactory oldFactory = new OldVehicleFactory();
        VehicleFactory newFactory = new NewVehicleFactory();

        ParkingSpace[] spacesForFloor1 = {
            new ParkingSpace(Size.SMALL),
            new ParkingSpace(Size.SMALL),
            new ParkingSpace(Size.SMALL)
        };
        ParkingSpace[] spacesForFloor2 = {
            new ParkingSpace(Size.LARGE),
            new ParkingSpace(Size.LARGE),
            new ParkingSpace(Size.LARGE)
        };

        Floor[] floors = {
            new Floor(spacesForFloor1),
            new Floor(spacesForFloor2)
        };

        Garage garage = new Garage(floors);
        createCarAndPark(garage, oldFactory, "Peugeot 206", "1234AB");
        createCarAndPark(garage, newFactory, "Tesla", "7654HY");

    }
}