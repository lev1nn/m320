package W05.vererbung;

public class UsedCar extends Car {
    private int mileage;

    public UsedCar(String model, int price) {
        super(model, price);
    }

    public double getPrice() {
        return getCarPrice() - getCarPrice() * (getMileage() * 0.000005);
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
