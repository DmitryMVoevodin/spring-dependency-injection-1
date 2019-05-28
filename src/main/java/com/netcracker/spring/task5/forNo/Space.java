package com.netcracker.spring.task5.forNo;

public class Space {

    private Rocket rocket;

    public Space() {
        //
    }

    public Space(Rocket rocket) {
        this.rocket = rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    @Override
    public String toString() {
        return ("Space with " + rocket.toString());
    }

}
