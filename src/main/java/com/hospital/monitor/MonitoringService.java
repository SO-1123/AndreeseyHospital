package com.hospital.monitor;
import com.hospital.controller.EnvironmentalSystem;
import com.hospital.model.*;
import java.util.List;
public class MonitoringService {
    private final EnvironmentalSystem controller;

    public MonitoringService(EnvironmentalSystem controller) {
        this.controller = controller;
    }

    public void updateReadings() {
        List<TemperatureReading> tempReadings = controller.getTemperatureReadings();
        HumidityReading humdiityReading = controller.getHumidityReading();
        PollutionReading pollutionReading = controller.getPollutionReading();


    }
}

