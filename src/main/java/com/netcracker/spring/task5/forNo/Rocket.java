package com.netcracker.spring.task5.forNo;

public class Rocket {

    private String title;
    private double weight;

    public Rocket(){
        //
    }

    public Rocket(String title, double weight) {
        this.title = title;
        this.weight = weight;
    }

    public void fly() {
        System.out.println("This rocket is flying in space.");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("Rocket: (" + title + "; " + weight + ")");
    }

}