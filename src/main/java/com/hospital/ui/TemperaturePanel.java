package com.hospital.ui;
import com.hospital.model.TemperatureReading;

public class TemperaturePanel extends SensorPanel{
    private TemperatureReading reading;

    public TemperaturePanel() {
        super("Temperature");
    }

    public void setReading(TemperatureReading reading) {
        this.reading =reading;
    }

    @Override
    public void updateDispalay() {

    }
}


