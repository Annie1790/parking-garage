package org.parking.models;

import org.parking.exceptions.SpaceNotFoundException;

public class Floor implements CarPark {

    ParkingSpace[] spaces;

    public Floor(ParkingSpace[] spaces) {
        this.spaces = spaces;
    }
    @Override
    public void parkHere(final Vehicle vehicle) throws SpaceNotFoundException {
        for (ParkingSpace space: spaces) {
            if (space.canVehicleParkhere(vehicle)) {
                space.parkHere(vehicle);
                break;
            } else {
                throw new SpaceNotFoundException("No space found!");
            }
        }
    }
}
