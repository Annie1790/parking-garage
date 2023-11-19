package org.parking.models;

import org.parking.enums.Size;

public class NewCar implements Car {
    String name;
    String regNum;
    Size size;

    public NewCar(final String name, final String regNum) {
        this.name = name;
        this.regNum = regNum;
        this.size = Size.SMALL;
    }

    @Override
    public void startEngine() {
        System.out.println("Smooth electric car sound");
    }

    @Override
    public Size getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
