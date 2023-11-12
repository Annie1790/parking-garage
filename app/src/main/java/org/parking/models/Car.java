package org.parking.models;

import org.parking.enums.Size;

public class Car extends Vehicle{

    public Car(final String name, final String regNum, final Size size) {
        super(name, regNum, size);
    }
}
