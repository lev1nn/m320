package W06.abstraktion;

public class UsedCar extends Car {
    private int mileage;

    public UsedCar(String model, int price, int mileage) {
        super(model, price);
        this.mileage = mileage;
    }

    public double getPrice() {
        return price - price * (getMileage() * 0.000005);
    }

    public int getMileage() {
        return mileage;
    }
}
