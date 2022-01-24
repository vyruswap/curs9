package curs9;


public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
	
		setAccountOwner(accountOwner);
		setBalance(balance);
		setAccountNumber(accountNumber);
	}

	@Override
	public void withdraw(int withdraw) throws InsuficientFundsException {

		if (withdraw > getBalance()) {
			
			System.out.println("The amount you entered is greater than the available balance " + getBalance());
			System.out.println("Thank you for using our ATM!");
			throw new InsuficientFundsException("Insuficient funds for transaction");
			
		} else {
			
			double newBalance = getBalance() - withdraw;
			
			System.out.println("Please pick your money!");
			System.out.println("Your new balance is: " + newBalance);
			System.out.println("Thank you for using our ATM!");
			
		}

	}

}