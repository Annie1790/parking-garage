package org.parking.models;

import org.junit.Test;
import org.parking.enums.Size;
import org.parking.exceptions.SpaceNotFoundException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class ParkingSpaceTest {

    @Test
    public void vehicleCanParkToEmptyEqualSizeSpace() throws SpaceNotFoundException {
        //GIVEN
        final Vehicle vehicle = new Motorbike("Test","1234DB");
        ParkingSpace space = new ParkingSpace(Size.SMALL);

        assertTrue(space.canVehicleParkHere(vehicle));
    }

    @Test
    public void vehicleCantParkToOccupiedEqualSizedSpace() throws SpaceNotFoundException {
        //GIVEN
        final Vehicle vehicle = new Van("Test","1234AB");
        ParkingSpace space = new ParkingSpace(Size.LARGE);
        //WHEN
        space.parkHere(vehicle);
        //THEN
        assertFalse(space.canVehicleParkHere(vehicle));
    }

    @Test
    public void vehicleCantParkToEmptyNotEqualSizedSpace() {
        final Vehicle vehicle = new Van("Test","1234AB");
        ParkingSpace space = new ParkingSpace(Size.SMALL);

        assertFalse(space.canVehicleParkHere(vehicle));
    }

    @Test
    public void vehicleCanParkAfterParkingSpaceLeft() throws SpaceNotFoundException {
        final Vehicle vehicle = new Van("Test","1234AB");
        ParkingSpace space = new ParkingSpace(Size.LARGE);

        space.parkHere(vehicle);
        space.leaveParkingSpace();

        assertTrue(space.canVehicleParkHere(vehicle));
    }

    @Test
    public void throwErrorIfVehicleCantParkToEmptyNotEqualSizedSpace() throws SpaceNotFoundException {
        final Vehicle vehicle = new Van("Test","1234AB");
        ParkingSpace space = new ParkingSpace(Size.SMALL);

        assertThrows(
            SpaceNotFoundException.class,
            () -> space.parkHere(vehicle)
        );
    }

    @Test
    public void throwErrorIfVehicleTriesToParkToOccupiedSpace() throws SpaceNotFoundException {
        final Vehicle vehicle = new Van("Test","1234AB");
        ParkingSpace space = new ParkingSpace(Size.LARGE);

        space.parkHere(vehicle);

        assertThrows(
            SpaceNotFoundException.class,
            () -> space.parkHere(vehicle)
        );
    }


}
