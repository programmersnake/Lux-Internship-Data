package jva_046.day_3.overriding_practic;

public class Student extends Person {
    
    private int numberOfCourse;

    public Student() {
        System.out.println("Student created");
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    public void study() {
        System.out.println("Student " + this.getName() + " is studying");
    }

    @Override
    public void can() {
        System.out.println("I`m student! I can study!!!");
    }

}
