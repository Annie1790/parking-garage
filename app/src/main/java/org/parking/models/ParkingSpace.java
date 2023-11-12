package org.parking.models;

import org.parking.enums.Size;
import org.parking.exceptions.SpaceNotFoundException;

public class ParkingSpace implements CarPark{

    Vehicle occupier = null;
    Size sizeOfSpace;

    public ParkingSpace(Size size) {
        this.occupier = null;
        this.sizeOfSpace = size;
    }

    @Override
    public void parkHere(final Vehicle vehicle) throws SpaceNotFoundException {
        if (canVehicleParkhere(vehicle)) {
            this.occupier = vehicle;
        } else {
            throw new SpaceNotFoundException("This space is already occupied!");
        }
    }

    public boolean canVehicleParkhere(Vehicle vehicle) {
        return this.occupier == null;
    }

    public void leaveParkingSpace() {
        this.occupier = null;
    }
}
