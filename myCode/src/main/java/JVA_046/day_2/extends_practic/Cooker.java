package JVA_046.day_2.extends_practic;

public class Cooker extends Worker {

    private int yearsOfExperience;

    public Cooker() {
        System.out.println("Cooker created");
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void cook() {
        System.out.println("Cooker " + this.getName() + " is cooking");
    }

}
