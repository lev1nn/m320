package W03.invoiceextention;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item(2.50, "Orange");
        Item item2 = new Item(1.20, "Apfel");
        Item item3 = new Item(3.90, "Ananas");

        Invoice invoice = new Invoice();

        invoice.addItem(item1);
        invoice.addItem(item2);
        invoice.addItem(item3);

        final double mwst = 7.7;

        invoice.printInvoice(mwst);
    }
}
