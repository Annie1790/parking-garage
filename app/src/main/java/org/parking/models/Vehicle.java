package org.parking.models;

import org.parking.enums.Size;

public class Vehicle {
    String name;
    String registrationNumber;
    Size size;

    public Vehicle(String name, String regNum, Size size) {
        this.name = name;
        this.registrationNumber = regNum;
        this.size = size;
    }
}
