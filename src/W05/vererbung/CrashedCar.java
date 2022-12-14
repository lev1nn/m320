package W05.vererbung;

public class CrashedCar extends Car {
    private int damageLevel;

    public CrashedCar(String model, int price) {
        super(model, price);
    }

    public double getPrice() {
        double remainingPrice = switch (getDamageLevel()) {
            case 0 -> 0.9;
            case 1 -> 0.5;
            case 2 -> 0;
            default -> 1;
        };

        return getCarPrice() * remainingPrice;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }
}
