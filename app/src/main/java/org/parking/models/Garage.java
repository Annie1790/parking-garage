package org.parking.models;

import org.parking.exceptions.SpaceNotFoundException;

public class Garage implements CarPark {
    Floor[] floors;

    public Garage(Floor[] floors) {
        this.floors = floors;
    }
    @Override
    public void parkHere(final Vehicle vehicle) throws SpaceNotFoundException {
    for (Floor floor: floors) {
        if ()
    }
    }
}
