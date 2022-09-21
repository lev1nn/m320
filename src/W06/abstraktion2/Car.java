package W06.abstraktion2;

public abstract class Car {
    private String model;
    protected int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public abstract double getPrice();

    public String getModel() {
        return model;
    }
}
