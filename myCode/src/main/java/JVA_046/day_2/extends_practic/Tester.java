package JVA_046.day_2.extends_practic;

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

}
