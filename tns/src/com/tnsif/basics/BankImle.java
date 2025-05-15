package com.tnsif.basics;

public class BankImle implements Bank {
	private double balance=1500;
	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("the amount after withdraw"+balance);
	    
		}
		else {
			System.out.println("no sufficent balance");
		}
		
	}
	@Override
	public void deposit(double amount) {
		if(amount<deposit_limit) {
			balance=balance+amount;
			System.out.println("the amount after deposit"+balance);
	    
		}
		else {
			System.err.println("limit exceed");
		}
		
		
	}
	
	

}
