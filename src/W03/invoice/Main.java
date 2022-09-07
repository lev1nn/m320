package W03.invoice;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item(2.50, "Orange");
        Item item2 = new Item(1.20, "Apfel");
        Item item3 = new Item(3.90, "Ananas");

        Invoice invoice = new Invoice();

        invoice.addItem(item1);
        invoice.addItem(item2);
        invoice.addItem(item3);

        invoice.printInvoice();
    }
}
