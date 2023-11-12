package org.parking.models;

import org.parking.enums.Size;

public class Motorbike extends Vehicle{

    public Motorbike(final String name, final String regNum) {
        super(name, regNum, Size.SMALL);
    }
}
