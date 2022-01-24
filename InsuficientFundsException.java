package curs9;

public class InsuficientFundsException extends Exception {

	public InsuficientFundsException(String insuficientFunds) {
		super(insuficientFunds);
	}

}