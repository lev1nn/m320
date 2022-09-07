package W03.others;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " -> " + list.get(i));
        }

        list.remove(2); // wenn der Eintrag an der Indexstelle 2 gelöscht wird, werden die anderen Einträge nach vorne gerückt
        System.out.println("----------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " -> " + list.get(i));
        }

        list.add("Test5");
        list.add("Test6");
        list.add("Test7");

        System.out.println("----------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " -> " + list.get(i));
        }
    }
}
