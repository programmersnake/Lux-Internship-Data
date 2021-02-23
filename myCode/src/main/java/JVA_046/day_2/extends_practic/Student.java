package JVA_046.day_2.extends_practic;

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

}
