package org.parking.models;

public interface VehicleFactory {

    public Vehicle createCar(String name, String regNum);
}
