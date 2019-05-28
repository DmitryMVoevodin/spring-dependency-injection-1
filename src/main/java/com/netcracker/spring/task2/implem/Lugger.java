package com.netcracker.spring.task2.implem;

import com.netcracker.spring.task2.Ship;

public class Lugger extends Ship {

    private final int HEALTH = 4;
    private final int ATTACK = 4;
    private final int DEFENCE = 4;
    private final int SPEED = 4;

    public Lugger(){
        super();
    }

    public Lugger(String country, int numberOfDock) {
        super(country, numberOfDock);
    }

    @Override
    public String type() {
        return ("Lugger(" + HEALTH + "," + ATTACK + "," + DEFENCE + "," + SPEED + ")");
    }

    @Override
    public void shoot() {
        System.out.println("Prepare to board!");
    }

    @Override
    public String toString() {
        return ("[" + super.toString() + "; type: " + type() + "]");
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Lugger)) return false;
        Lugger another = (Lugger) obj;
        return (this.getCountry().equals(another.getCountry()) &&
                this.getNumberOfDock() == another.getNumberOfDock());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + super.hashCode();
        result = 31 * result + HEALTH;
        result = 31 * result + ATTACK;
        result = 31 * result + DEFENCE;
        result = 31 * result + SPEED;
        return result;
    }

}
