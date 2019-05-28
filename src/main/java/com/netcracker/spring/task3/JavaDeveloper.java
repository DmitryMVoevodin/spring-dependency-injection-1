package com.netcracker.spring.task3;

public class JavaDeveloper extends Human{

    private String technologies;


    public JavaDeveloper(){
        //
    }

    public JavaDeveloper(String name, int age, String sex, String email, String technologies) {
        super(name, age, sex, email);
        this.technologies = technologies;
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setAge(int age) {
        super.setAge(age);
    }

    public void setSex(String sex) {
        super.setSex(sex);
    }

    public void setEmail(String email) {
        super.setEmail(email);
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return (super.toString() + "; Java-developer, technologies: " + technologies);
    }

}
