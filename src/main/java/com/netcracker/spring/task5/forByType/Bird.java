package com.netcracker.spring.task5.forByType;

public class Bird {

    private String title;
    private double weight;

    public Bird(){
        //
    }

    public Bird(String title, double weight) {
        this.title = title;
        this.weight = weight;
    }

    public void fly() {
        System.out.println("This bird is flying in the sky.");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("Bird: (" + title + "; " + weight + ")");
    }

}
