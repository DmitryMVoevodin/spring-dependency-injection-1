package com.netcracker.spring.task5.forConstructor;

public class Animal {

    private String title;
    private double weight;

    public Animal(){
        //
    }

    public Animal(String title, double weight) {
        this.title = title;
        this.weight = weight;
    }

    public void run() {
        System.out.println("This animal is running in the forest.");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("Animal: (" + title + "; " + weight + ")");
    }

}