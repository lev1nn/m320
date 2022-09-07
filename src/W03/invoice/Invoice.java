package W03.invoice;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Invoice {
    public static ArrayList<Item> list = new ArrayList<Item>();

    public void addItem(Item item) {
        list.add(item);
    }

    public double getInvoice() {
        double sum = 0;

        for (Item item : list) {
            sum += item.getPrice();
        }

        return sum;
    }

    public void printInvoice() {
        NumberFormat n = NumberFormat.getInstance();
        n.setMaximumFractionDigits(2);

        for (Item item : list) {
            System.out.printf("%8s -> CHF %s.-%n", item.getDescription(), n.format(item.getPrice()));
        }
        System.out.println("");
        System.out.println("Sum: " + getInvoice());
    }
}
