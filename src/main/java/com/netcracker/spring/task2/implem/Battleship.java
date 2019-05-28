package com.netcracker.spring.task2.implem;

import com.netcracker.spring.task2.Ship;

public class Battleship extends Ship {

    private final int HEALTH = 10;
    private final int ATTACK = 10;
    private final int DEFENCE = 10;
    private final int SPEED = 1;

    public Battleship(){
        super();
    }

    public Battleship(String country, int numberOfDock) {
        super(country, numberOfDock);
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public int getNumberOfDock() {
        return super.getNumberOfDock();
    }

    @Override
    public String type() {
        return ("Battleship(" + HEALTH + "," + ATTACK + "," + DEFENCE + "," + SPEED + ")");
    }

    @Override
    public void shoot() {
        System.out.println("Fire with cannonballs!");
    }

    @Override
    public String toString() {
        return ("[" + super.toString() + "; type: " + type() + "]");
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Battleship)) return false;
        Battleship another = (Battleship) obj;
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