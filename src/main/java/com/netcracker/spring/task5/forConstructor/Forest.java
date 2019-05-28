package com.netcracker.spring.task5.forConstructor;

public class Forest {

    private Animal animal;

    public Forest() {
        //
    }

    public Forest(Animal animal) {
        this.animal = animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return ("Forest with " + animal.toString());
    }

}
