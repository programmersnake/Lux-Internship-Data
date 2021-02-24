package jva_046.day_3.overriding_practic;

public class Pupil extends Person {

    private int numberOfClass;

    public int getNumberOfClass() {
        return numberOfClass;
    }

    public void setNumberOfClass(int numberOfClass) {
        this.numberOfClass = numberOfClass;
    }

    public Pupil() {
        System.out.println("Pupil created");
    }

    public void study() {
        System.out.println("Pupil " + this.getName() + " is studying");
    }

    @Override
    public void can() {
        System.out.println("I`m pupil! I can study!!!");
    }
}
