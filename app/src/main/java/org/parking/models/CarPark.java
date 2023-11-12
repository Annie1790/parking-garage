package org.parking.models;

import org.parking.exceptions.SpaceNotFoundException;

public interface CarPark {
    public void parkHere(Vehicle vehicle) throws SpaceNotFoundException;
}
