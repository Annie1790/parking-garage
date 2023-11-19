package org.parking.models;

public class NewVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle createCar(final String name, final String regNum) {
        return new NewCar(name, regNum);
    }
}
