package com.hospital.model;

public abstract class SensorReading {
    protected boolean isInRange;

    public abstract boolean checkRange();

    public boolean isInRange() {
        return isInRange;
    }
}


