package W08.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(2, 1));
        System.out.println(subtract(2, 1));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
