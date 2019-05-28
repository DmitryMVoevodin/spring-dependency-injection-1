package com.netcracker.spring.task5.forByType;

public class Sky {

    private Bird bird;

    public Sky() {
        //
    }

    public Sky(Bird bird) {
        this.bird = bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }

    @Override
    public String toString() {
        return ("Sky with " + bird.toString());
    }

}
