package JVA_046.day_2.extends_practic;

public class Dancer extends Worker {

    private int yearsOfExperience;

    public Dancer() {
        System.out.println("Dancer created");
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void dance() {
        System.out.println("Dancer " + this.getName() + " is dancing");
    }

}
