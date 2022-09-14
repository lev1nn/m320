package W05.polymorphie;

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
        List<Car> carList = new ArrayList<>();
        carList.add(usedCar);
        carList.add(crashedCar);

        for (Car car : carList) {
            System.out.println(car.getModel() + ": " + car.getPrice());
        }

        System.out.println();
    }
}
