package W05.Vererbung;

public class Tester {
    public static void main(String[] args) {
        System.out.println("");

        UsedCar usedCar = new UsedCar("Mercedes G Class",90000);
        usedCar.setMileage(50000);
        System.out.println("Mercedes G Class Price: " + usedCar.getPrice());

        System.out.println("");

        CrashedCar crashedCar = new CrashedCar("Nissan Skyline GTR R34", 70000);
        crashedCar.setDamageLevel(1);
        System.out.println("Nissan Skyline GTR R34 Price: " + crashedCar.getPrice());
    }
}
