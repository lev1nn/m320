package W03.invoice;

public class Item {
    private double price;
    private String description;

    public Item (double price, String description) {
        this.price = price;
        this.description = description;
    }

    public Item() {
        price = 0.0;
        description = "no description available";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
