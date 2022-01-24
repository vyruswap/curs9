package curs9;

public abstract class Account {

	private int accountNumber;
	public double balance;
	public Customer accountOwner;


	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner;
	}
	abstract public void withdraw(int withdraw) throws InsuficientFundsException;;

	
}