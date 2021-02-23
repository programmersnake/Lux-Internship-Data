package JVA_046.DAY_1;

import java.util.ArrayList;

public class CarFactory {

    public static void main(String[] args) {
        Car tractor1 = new Car();
        tractor1.setBrand( "Tractor MTZ-80" );
        tractor1.setCost( 60000 );
        tractor1.setHorsePower( 81 );
        tractor1.setElectricity( false );
        tractor1.setWheels( 4 );

        tractor1.showInfo();

        Car tesla1 = new Car();
        tesla1.brand = "Tesla Model X";
        tesla1.cost = 110000;
        tesla1.horsePower = 773;
        tesla1.isElectricity = true;
        tesla1.wheels = 4;

        tesla1.showInfo();

        ArrayList<Car> cars = new ArrayList<>();
        cars.add( tractor1 );
        cars.add( tesla1 );
        System.out.println(cars);

        Car[] carsArray = cars.toArray(new Car[cars.size()]);

        for (Car car:carsArray) {
            car.moveNow();
            car.stopNow();
        }
    }

}
