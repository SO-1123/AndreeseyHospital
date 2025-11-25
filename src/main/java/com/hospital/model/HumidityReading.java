package com.hospital.model;

public class HumidityReading extends SensorReading {

    private final int insideHumidity;
    private final int outsideHumidity;
    private final boolean dehumdifierOn;
    private static final int MAX_DIFFERENCE = 10;

    public HumidityReading(int insideHumidity,int outsideHumidity,boolean dehumdifierOn) {
        this.insideHumidity = insideHumidity;
        this.outsideHumidity = outsideHumidity;
        this.dehumdifierOn = dehumdifierOn;
        this.isInRange = checkRange();
    }

    @Override
    public boolean checkRange() {
        return (insideHumidity -outsideHumidity) <= MAX_DIFFERENCE;
    }

    public int getInsideHumidity() {
        return insideHumidity;
    }

    public int getOutsideHumidity() {
        return outsideHumidity;
    }

    public int getDifference() {
        return (insideHumidity - outsideHumidity);
    }

    public boolean isDehumdifierOn() {
        return dehumdifierOn;
    }
}
