package W05.polymorphie;

public class UsedCar extends Car {
    private int mileage;

    public UsedCar(String model, int price, int mileage) {
        super(model, price);
        this.mileage = mileage;
    }

    public double getPrice() {
        return super.getPrice() - super.getPrice() * (getMileage() * 0.000005);
    }

    public int getMileage() {
        return mileage;
    }
}
