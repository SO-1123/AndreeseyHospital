package com.hospital.ui;
import com.hospital.model.HumidityReading;

public class HumidityPanel extends SensorPanel{
    private HumidityReading reading;

    public HumidityPanel() {
        super("Humidity");
    }

    public void setReading(HumidityReading reading) {
        this.reading =reading;
    }


    @Override
    public void updateDispalay() {

    }
}
