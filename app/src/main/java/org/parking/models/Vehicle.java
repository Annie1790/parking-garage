package org.parking.models;

import org.parking.enums.Size;

public interface Vehicle {

    public void startEngine();

    public Size getSize();

    public String getName();
}
