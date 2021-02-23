package JVA_046.DAY_1;

public class Car {

    String brand;
    int wheels;
    double horsePower;
    int cost;
    boolean isElectricity;
    boolean isMove;

    public Car(String brand, int wheels, double horsePower, int cost, boolean isElectricity, boolean isMove) {
        this.brand = brand;
        this.wheels = wheels;
        this.horsePower = horsePower;
        this.cost = cost;
        this.isElectricity = isElectricity;
        this.isMove = isMove;
    }

    public Car() {
    }

    public void showInfo() {
        System.out.println("Brand: " + brand + "; horsePower: " + horsePower + "; Cost: " + cost + "; Wheels: " + wheels + "; isElectricity: " + isElectricity);
    }

    public void moveNow() {
        isMove = true;
        System.out.println("***********************");
        System.out.println(brand + " move");
        System.out.println("***********************");
    }

    public void stopNow() {
        isMove = false;
        System.out.println("//////////////////////");
        System.out.println(brand + " don`t move");
        System.out.println("//////////////////////");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setElectricity(boolean electricity) {
        isElectricity = electricity;
    }
}
