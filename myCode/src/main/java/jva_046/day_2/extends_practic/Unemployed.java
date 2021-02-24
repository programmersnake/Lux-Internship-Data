package jva_046.day_2.extends_practic;

public class Unemployed extends Person {

    private String[] skills;

    public Unemployed() {
        System.out.println("Unemployed created");
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}
