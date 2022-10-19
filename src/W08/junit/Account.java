package W08.junit;
/**
 * Class to represent an account
 * 
 * @author Levin Schaller
 * 
 */
public class Account {

	private double balance;

	/**
	 * Creates an new AccountSimple instance
	 * 
	 * @param initialBalance
	 *            initial balance of the account
	 */
	public Account(double initialBalance) {
		this.balance = initialBalance;
	}

	/**
	 * Returns the current balance of the account
	 * 
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	
	/**
	 * get some money from the account
	 * 
	 * @param amount
	 */
	public boolean withdraw(double amount) {
		if (this.balance - amount >= 0) {
			this.balance -= amount;
			return true;
		}
		return false;
	}

	/**
	 * add money to the account
	 * 
	 * @param amount
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}
}
