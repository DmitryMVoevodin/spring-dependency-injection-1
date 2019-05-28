package com.netcracker.spring.task3;

public class Human {

    private String name;
    private int age;
    private String sex;
    private String email;


    public Human(){
        //
    }

    public Human(String name, int age, String sex, String email) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ("Human [name: " + name + "; age: " + age + "; sex: " + sex + "; email: " + email + "]");
    }

}
