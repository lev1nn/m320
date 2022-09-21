package W06.abstraktion2;

public class CrashedCar extends Car {
    private int damageLevel;

    public CrashedCar(String model, int price, int damageLevel) {
        super(model, price);
        this.damageLevel = damageLevel;
    }

    public double getPrice() {
        double remainingPrice = switch (getDamageLevel()) {
            case 0 -> 0.9;
            case 1 -> 0.5;
            case 2 -> 0;
            default -> 1;
        };

        return price * remainingPrice;
    }

    public int getDamageLevel() {
        return damageLevel;
    }
}
