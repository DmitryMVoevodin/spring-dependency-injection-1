package com.netcracker.spring.task5.forAnnotation;

public class Food {

    private String title;
    private double weight;

    public Food(){
        //
    }

    public Food(String title, double weight) {
        this.title = title;
        this.weight = weight;
    }

    public void lie() {
        System.out.println("This food is lying in the fridge.");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("Food: (" + title + "; " + weight + ")");
    }

}