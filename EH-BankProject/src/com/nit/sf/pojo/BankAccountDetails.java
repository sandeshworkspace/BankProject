package com.nit.sf.pojo;

public class BankAccountDetails {
	
	//setters and getters
	private long accNum;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public String getAccHName() {
		return accHName;
	}
	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private String accHName;
	private double balance;
	
	@Override
	public String toString() {
		return "BankAccountDetails [accNum=" + accNum + ", accHName=" + accHName + ", balance=" + balance + "]";
	}
	
	//to String
	
	
	
}
