package com.nit.sf.spec;

import com.nit.sf.customexception.InsufficientFundsException;
import com.nit.sf.customexception.InvalidAmountException;
import com.nit.sf.pojo.BankAccountDetails;

public interface BankAccount {
public void init(BankAccountDetails accDetails);
	
	public void deposit(double amt) 
			throws InvalidAmountException;
	
	public void withdraw(double amt) 
			throws InvalidAmountException, InsufficientFundsException ;
	
	public void currentBalance();
	
	public void transferMoney(BankAccount destAcc, double amt)
			throws InvalidAmountException, InsufficientFundsException;
}
