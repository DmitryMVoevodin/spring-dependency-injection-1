package com.netcracker.spring.task2.implem;

import com.netcracker.spring.task2.Ship;

public class Caravel extends Ship {

    private final int HEALTH = 6;
    private final int ATTACK = 7;
    private final int DEFENCE = 5;
    private final int SPEED = 7;

    public Caravel(){
        super();
    }

    public Caravel(String country, int numberOfDock) {
        super(country, numberOfDock);
    }

    @Override
    public String type() {
        return ("Caravel(" + HEALTH + "," + ATTACK + "," + DEFENCE + "," + SPEED + ")");
    }

    @Override
    public void shoot() {
        System.out.println("Fire with shrapnel!");
    }

    @Override
    public String toString() {
        return ("[" + super.toString() + "; type: " + type() + "]");
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Caravel)) return false;
        Caravel another = (Caravel) obj;
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
