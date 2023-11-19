package org.parking.models;

public class NewVehicleFactory implements VehicleFactory {

    @Override
    public Car createCar(final String name, final String regNum) {
        return new NewCar(name, regNum);
    }
}
