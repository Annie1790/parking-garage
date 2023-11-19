package org.parking.models;

import org.parking.enums.Size;
import org.parking.exceptions.SpaceNotFoundException;

public class ParkingSpace implements CarPark{

    Car occupier = null;
    Size sizeOfSpace;

    public ParkingSpace(Size size) {
        this.occupier = null;
        this.sizeOfSpace = size;
    }

    @Override
    public void parkHere(final Car vehicle) throws SpaceNotFoundException {
        if (canVehicleParkHere(vehicle)) {
            this.occupier = vehicle;
        } else {
            throw new SpaceNotFoundException("This space is already occupied!");
        }
    }

    public boolean canVehicleParkHere(Car vehicle) {
        return this.occupier == null && vehicle.getSize().equals(this.sizeOfSpace);
    }

    public void leaveParkingSpace() {
        this.occupier = null;
    }
}
