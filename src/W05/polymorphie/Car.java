package W05.polymorphie;

public class Car {
    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
