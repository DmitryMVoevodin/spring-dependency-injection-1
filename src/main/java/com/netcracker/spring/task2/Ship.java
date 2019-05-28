package com.netcracker.spring.task2;

public abstract class Ship implements ShipI {

    private String country;
    private int numberOfDock;

    public Ship(){
        //
    }

    public Ship(String country, int numberOfDock){
        this.country = country;
        this.numberOfDock = numberOfDock;
    }

    public String getCountry() {
        return country;
    }

    public int getNumberOfDock() {
        return numberOfDock;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNumberOfDock(int numberOfDock) {
        this.numberOfDock = numberOfDock;
    }

    @Override
    public String toString() {
        return ("country: " + country + "; dock: " + numberOfDock);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + country.hashCode();
        result = 31 * result + numberOfDock;
        return result;
    }

}