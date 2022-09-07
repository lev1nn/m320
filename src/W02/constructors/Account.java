package W02.constructors;

public class Account {
    private double balance;

    public Account(){
        this.balance = 100;
    }

    public Account(double balance){
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
