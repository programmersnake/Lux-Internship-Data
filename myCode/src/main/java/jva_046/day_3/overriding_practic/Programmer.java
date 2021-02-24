package jva_046.day_3.overriding_practic;

public class Programmer extends Worker {

    private int yearsOfExperience;

    public Programmer() {
        System.out.println("Programmer created");
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void programing() {
        System.out.println("Programmer " + this.getName() + " is programming");
    }

}
