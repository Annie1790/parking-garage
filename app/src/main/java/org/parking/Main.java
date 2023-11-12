package org.parking;

import org.parking.models.*;
import org.parking.enums.*;
import org.parking.exceptions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SpaceNotFoundException {
        Vehicle car = new Car("Peugeot","1234DB");
        Vehicle motorbike = new Motorbike("Honda", "6543YJ");
        Vehicle van = new Van("Cat", "9876VD");

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
        garage.parkHere(car);
    }
}