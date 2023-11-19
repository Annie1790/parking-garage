package org.parking.models;

public class OldVehicleFactory implements VehicleFactory{

    @Override
    public Vehicle createCar(String name, String regNum) {
        return new OldCar(name, regNum);
    }
}
