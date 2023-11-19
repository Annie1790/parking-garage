package org.parking.models;

import org.parking.enums.Size;

public class OldCar implements Car{
    String name;
    String regNum;
    Size size;

    public OldCar(final String name, final String regNum) {
         this.name = name;
         this.regNum = regNum;
         this.size = Size.SMALL;
    }

    @Override
    public void startEngine() {
        System.out.println("Old car sound");
    }

    @Override
    public Size getSize() {
        return this.size;
    }
}
