package org.parking;

import org.parking.models.*;
import org.parking.enums.*;
import org.parking.exceptions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehiclesToPark = Arrays.asList(
            new Car("Peugeot","123AB3",Size.SMALL),
            new Van("Cat","956UZ4",Size.LARGE),
            new Motorbike("Triumph","451RJ5",Size.SMALL)
        );

    }
}