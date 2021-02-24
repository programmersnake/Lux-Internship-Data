package jva_046.day_2.extends_practic;

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
}
