package com.hospital.controller;
import com.hospital.model.*;
import java.util.List;

public class EnvironmentalSystem {

    private final EnvironmentalSystem system;
    private final List<Ward> wards;

    public EnvironmentalSystem(EnvironmentalSystem system, List<Ward> wards) {
        this.system = system;
        this.wards = wards;
    }

    public void controlTemperature(TemperatureReading reading) {
        Ward ward = reading.getWard();
        float currentTemp = reading.getCurrentTemp();
        float idealTemp = ward.getIdealTemperature();

        if(currentTemp < idealTemp - 0.5f) {
            system.turnHeatingOn(ward.getId(),true);
        } else if(currentTemp > idealTemp + 0.5f) {
            system.turnHeatingOn(ward.getId(),false);
        }
    }

    public void controlHumidity(HumidityReading reading) {
        if(reading.getDifference() > 10) {
            system.turnDehumidifierOn(true);
        } else if(reading.getDifference() < 10) {
            system.turnDehumidifierOn(false);
        }
    }

    public void controlPollution(PollutionReading reading) {
        if(reading.getPollutionLevel() > 5) {
            system.turnAirPurifierOn(true);
        } else if(reading.getPollutionLevel() < 5) {
            system.turnAirPurifierOn(false);
        }
    }

    public List<TemperatureReading> getTemperatureReadings() {
        return wards.stream().map(ward ->
                new TemperatureReading(ward, system.getTempFeed().getTemperature(ward.getId())
                )).toList();
    }

    public HumidityReading getHumidityReading() {
        return new HumidityReading(
                system.getHumidityFeed().getInsideHumidity(),
                system.getHumidityFeed().getOutsideHumidity(),
                system.isDehumidifierOn()
        );
    }

    public PollutionReading getPollutionReading() {
        return new PollutionReading(
                system.getPollutionFeed().getPollution(),
                system.isAirPurifierOn(),
        );
    }

    public String getUltrasoundScannerStatus() {
        return system.getUltrasoundScannerStatus();
    }
    public String getCTScannerStatus() {
        return system.getCTScannerStatus();
    }

}
