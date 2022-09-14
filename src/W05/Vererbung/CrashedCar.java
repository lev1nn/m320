package W05.Vererbung;

public class CrashedCar extends Car {
    private int damageLevel;

    public CrashedCar(String model, int price) {
        super(model, price);
    }

    public double getPrice() {
        double remainingPrice;

        switch(getDamageLevel()) {
            case 0:
                remainingPrice = 0.9;
                break;
            case 1:
                remainingPrice = 0.5;
                break;
            case 2:
                remainingPrice = 0;
                break;
            default:
                remainingPrice = 1;
        }

        return getCarPrice() * remainingPrice;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }
}
