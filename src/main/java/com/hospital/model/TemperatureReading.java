package com.hospital.model;

public class TemperatureReading extends SensorReading{
    private final Ward ward;
    private final float currentTemp;
    private final boolean heatingOn;
    private static final float TOLERANCE = 0.5f;

    public TemperatureReading(Ward ward,float currentTemp,boolean heatingOn) {
        this.ward = ward;
        this.currentTemp = currentTemp;
        this.heatingOn = heatingOn;
    }

    @Override
    public boolean checkRange() {
        float diff = Math.abs(currentTemp - ward.getIdealTemperature());
        return diff <= TOLERANCE;
    }

    public Ward getWard() {
        return ward;
    }

    public float getCurrentTemp() {
        return currentTemp;
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }
}
