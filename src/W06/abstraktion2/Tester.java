package W06.abstraktion2;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        System.out.println("");

        // Test1
        Car usedCar = new UsedCar("Mercedes G Class",90000, 10000);
        System.out.println("Mercedes G Class Price: " + usedCar.getPrice());

        System.out.println("");

        // Test2
        Car crashedCar = new CrashedCar("Nissan Skyline GTR R34", 70000, 0);
        System.out.println("Nissan Skyline GTR R34 Price: " + crashedCar.getPrice());

        System.out.println("");

        // Test3
        Car mobilityCar = new MobilityCar("Lamborghini Aventador", 500000, 100);
        System.out.println("Lamborghini Aventador Price: " + mobilityCar.getPrice());

        System.out.println("");

        // Test4
        List<Car> carList = new ArrayList<>();
        carList.add(usedCar);
        carList.add(crashedCar);
        carList.add(mobilityCar);

        for (Car car : carList) {
            System.out.println(car.getModel() + ": " + car.getPrice());
        }

        System.out.println();
    }
}
