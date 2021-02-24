package jva_046.day_3.overriding_practic;

public class Actor extends Worker {

    private int yearsOfExperience;
    private String[] myFilms;

    public Actor() {
        System.out.println("Actor created");
    }

    public String[] getMyFilms() {
        return myFilms;
    }

    public void setMyFilms(String[] myFilms) {
        this.myFilms = myFilms;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void play() {
        System.out.println("Actor " + this.getName() + " is playing");
    }

    @Override
    public void can() {
        System.out.println("I`m actor! I can play!!!");
    }

}
