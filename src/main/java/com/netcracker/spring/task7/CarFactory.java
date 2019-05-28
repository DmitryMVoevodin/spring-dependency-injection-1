package com.netcracker.spring.task7;

public class CarFactory {

    private String transmission;
    private String wheels;
    private String color;
    private Engine engine;

    public CarFactory() {
        //
    }

    public CarFactory(String transmission, String wheels, String color, Engine engine) {
        this.transmission = transmission;
        this.wheels = wheels;
        this.color = color;
        this.engine = engine;
    }



    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return ("Characteristics of Car Factory production [transmission: " + transmission + "; wheels: " + wheels +
                "; car's color: " + color + "]");
    }

}