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
        if (canVehicleParkHere(vehicle)) {
            this.occupier = vehicle;
            System.out.println("Parked: " + vehicle.getName());
        } else {
            throw new SpaceNotFoundException("This space is already occupied!");
        }
    }

    public boolean canVehicleParkHere(Vehicle vehicle) {
        return this.occupier == null && vehicle.getSize().equals(this.sizeOfSpace);
    }

    public void leaveParkingSpace() {
        this.occupier = null;
    }
}
