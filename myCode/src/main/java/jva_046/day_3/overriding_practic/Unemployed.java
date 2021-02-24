package jva_046.day_3.overriding_practic;

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

    @Override
    public void can() {
        System.out.print("I`m unemployed! I can ");
        for (String skill : skills) {
            System.out.print(skill + ", ");
        }
        System.out.println();
    }
}
