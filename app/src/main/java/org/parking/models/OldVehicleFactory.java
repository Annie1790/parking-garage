package org.parking.models;

public class OldVehicleFactory implements VehicleFactory{

    @Override
    public Car createCar(String name, String regNum) {
        return new OldCar(name, regNum);
    }
}
