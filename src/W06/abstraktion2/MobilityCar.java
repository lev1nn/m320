package W06.abstraktion2;

public class MobilityCar extends Car {
    private int days;
    private final int dailyRate = 72;

    public MobilityCar(String model, int price, int days) {
        super(model, price);
        this.days = days;
    }

    public double getPrice() {
        return days * dailyRate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
