package com.netcracker.spring.task5.forByName;

public class Lake {

    private Fish fish;

    public Lake() {
        //
    }

    public Lake(Fish fish) {
        this.fish = fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

    @Override
    public String toString() {
        return ("Lake with " + fish.toString());
    }

}
