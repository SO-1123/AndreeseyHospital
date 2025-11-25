package com.hospital.model;
public class Ward {
    private final int id;
    private final String name;
    private final float idealTemperature;

    public Ward(int id, String name, float idealTemperature){
        this.id = id;
        this.name = name;
        this.idealTemperature = idealTemperature;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getIdealTemperature() {
        return idealTemperature;
    }
}
