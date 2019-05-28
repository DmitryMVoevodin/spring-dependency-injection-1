package com.netcracker.spring.task5.forByName;

public class Fish {

    private String title;
    private double weight;

    public Fish(){
        //
    }

    public Fish(String title, double weight) {
        this.title = title;
        this.weight = weight;
    }

    public void swim() {
        System.out.println("This fish is swimming in the lake.");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("Fish: (" + title + "; " + weight + ")");
    }

}
