package com.netcracker.spring.task7;

import java.util.Random;

public class Engine {

    private String type;
    private int numberOfCylinders;

    public Engine() {
        Random rnd = new Random();
        int rType = rnd.nextInt(3);
        switch (rType) {
            case 0: type = "Petrol"; break;
            case 1: type = "Diesel"; break;
            case 2: type = "Gas"; break;
        }
        rType = rnd.nextInt(2);
        switch (rType) {
            case 0: numberOfCylinders = 4; break;
            case 1: numberOfCylinders = 6; break;
        }
    }

    public Engine(String type, int numberOfCylinders) {
        this.type = type;
        this.numberOfCylinders = numberOfCylinders;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    @Override
    public String toString() {
        return ("Engine: type=" + type + ", number_of_Cylinders=" + numberOfCylinders);
    }

}