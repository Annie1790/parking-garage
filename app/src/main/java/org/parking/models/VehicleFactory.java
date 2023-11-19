package org.parking.models;

public interface VehicleFactory {

    public Car createCar(String name, String regNum);
}
