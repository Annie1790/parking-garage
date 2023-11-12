package org.parking.models;

import org.parking.enums.Size;

public class Van extends Vehicle{

    public Van(final String name, final String regNum) {
        super(name, regNum, Size.LARGE);
    }
}
