package jva_046.day_3.overriding_practic;

public class Person {

    private String name;

    public Person() {
        System.out.println("Person created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void can() {
        System.out.println("I`m only lazy man. I can`t do anything");
    }
}
