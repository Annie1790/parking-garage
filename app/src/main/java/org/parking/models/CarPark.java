package org.parking.models;

import org.parking.exceptions.SpaceNotFoundException;

public interface CarPark {
    public void parkHere(Car vehicle) throws SpaceNotFoundException;
}
