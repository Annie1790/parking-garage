package org.parking.models;

import org.parking.enums.Size;

public class Car extends Vehicle{

    public Car(final String name, final String regNum) { super(name, regNum, Size.LARGE); }
}
