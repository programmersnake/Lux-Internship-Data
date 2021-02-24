package jva_046.day_3.overriding_practic;

public class Tester extends Worker {

    private int yearsOfExperience;

    public Tester() {
        System.out.println("Tester created");
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void testing() {
        System.out.println("Tester " + this.getName() + " is testing");
    }

    @Override
    public void can() {
        System.out.println("I`m Tester! I can test!");
    }

}
