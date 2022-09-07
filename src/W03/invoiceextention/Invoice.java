package W03.invoiceextention;

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

    public void printInvoice(double mwst) {
        NumberFormat n = NumberFormat.getInstance();
        n.setMaximumFractionDigits(2);

        System.out.println("Items: ");
        for (Item item : list) {
            System.out.printf("%7s -> CHF %s.-%n", item.getDescription(), n.format(item.getPrice()));
        }
        System.out.println("");
        System.out.printf("MwSt: CHF %s.-%n", n.format((getInvoice() / 100 * mwst)));
        System.out.printf("Sum incl. MwSt: CHF %s.-%n", n.format((getInvoice() / 100 * (100 + mwst))));
        System.out.printf("Sum excl. MwSt: CHF %s.-%n", n.format(getInvoice()));
    }
}
