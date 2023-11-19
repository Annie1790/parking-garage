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
            if (space.canVehicleParkHere(vehicle)) {
                space.parkHere(vehicle);
                return;
            }
        }
        throw new SpaceNotFoundException("No space found!");
    }
}
