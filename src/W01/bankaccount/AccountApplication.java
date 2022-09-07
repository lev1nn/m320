package W01.bankaccount;

import java.util.Scanner;

public class AccountApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to the account application");
        Account sparkonto = new Account();
        double amount = 0;
        String command = "";

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the amount, 0 (zero) to terminate");
            amount = sc.nextDouble();

            if (amount != 0) {
                System.out.println("To deposit, press +, to withdraw press -");
                command = sc.next();

                if (command.equals("+")) {
                    sparkonto.deposit(amount);

                } else if (command.equals("-")) {
                    sparkonto.withdraw(amount);
                }
            }
        } while (amount != 0);

        System.out.println("Final balance: " + sparkonto.getBalance());
    }
}