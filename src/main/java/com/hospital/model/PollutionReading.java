package com.hospital.model;

public class PollutionReading extends SensorReading{
    private final float pollutionLevel;
    private final boolean airPurifierOn;
    private static final float MAX_POLLUTION = 5.0f;

    public PollutionReading(float pollutionLevel, boolean airPurifierOn){
        this.pollutionLevel = pollutionLevel;
        this.airPurifierOn = airPurifierOn;
        this.isInRange = checkRange();

    }
    @Override
    public boolean checkRange() {
        return pollutionLevel <= MAX_POLLUTION;
    }

    public float getPollutionLevel() {
        return pollutionLevel;
    }

    public boolean isAirPurifierOn(){
        return airPurifierOn;
    }
}
