package org.parking.models;

import java.util.Random;

public class RandomVehicleFactory implements VehicleFactory{
    VehicleFactory factory1;
    VehicleFactory factory2;

    public RandomVehicleFactory(VehicleFactory factory1, VehicleFactory factory2) {
        this.factory1 = factory1;
        this.factory2 = factory2;
    }

    @Override
    public Vehicle createCar(final String name, final String regNum) {
        int number = new Random().nextInt(11);

        if (number >= 5) {
            return factory1.createCar(name,regNum);
        } else {
            return factory2.createCar(name,regNum);
        }
    }
}
