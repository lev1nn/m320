package W05.vererbung;

public class Car {
    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    protected int getCarPrice() {
        return price;
    }
}
