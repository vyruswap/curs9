package curs9;
import java.util.Scanner;


public class TestSavingsAccount {

	public static void main(String[] args) throws InsuficientFundsException {

		Customer customer = new Customer("Ion", "Dorobanti", "ion@popescu.com");
		SavingsAccount account = new SavingsAccount(1, 150, customer);
		
		System.out.println("Hi " + customer.getName());

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the amount to withdraw: ");
		
		int draw = scan.nextInt();
		account.withdraw(draw);
		
	}

}