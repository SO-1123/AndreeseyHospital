package com.hospital.ui;
import com.hospital.model.PollutionReading;

public class PollutionPanel extends SensorPanel{
    private PollutionReading reading;

    public PollutionPanel() {
        super("Humidity");
    }

    public void setReading(PollutionReading reading) {
        this.reading =reading;
    }


    @Override
    public void updateDispalay() {

    }
}
