package jva_046.day_3.overriding_practic;

public class Worker extends Person {

    private double priceForHour;

    public Worker() {
        System.out.println("Worker created");
    }

    public double getPriceForHour() {
        return priceForHour;
    }

    public void setPriceForHour(double priceForHour) {
        this.priceForHour = priceForHour;
    }

    public void work() {
        System.out.println("Worker " + this.getName() + " is working");
    }

    @Override
    public void can() {
        System.out.println("I`m Worker! I can work!!!");
    }

}
