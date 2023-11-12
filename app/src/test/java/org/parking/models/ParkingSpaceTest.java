package org.parking.models;

import org.junit.Test;
import org.parking.enums.Size;
import org.parking.exceptions.SpaceNotFoundException;

import static org.junit.Assert.assertFalse;

public class ParkingSpaceTest {

    @Test
    public void vehicleCanParkHereWithEqualSize() throws SpaceNotFoundException {
        //GIVEN
        final Vehicle vehicle = new Van("Test","1234AB");
        ParkingSpace space = new ParkingSpace(Size.LARGE);
        //WHEN
        space.parkHere(vehicle);
        //THEN
        assertFalse(space.canVehicleParkHere(vehicle));
    }



}
