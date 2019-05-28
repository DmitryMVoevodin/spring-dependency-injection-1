package com.netcracker.spring.task5.forAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Refrigerator {

    private Food food;

    public Refrigerator() {
        //
    }

    public Refrigerator(Food food) {
        this.food = food;
    }

    @Autowired
    @Qualifier("foodFromRefrigerator")
    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return ("Refrigerator with " + food.toString());
    }

}
