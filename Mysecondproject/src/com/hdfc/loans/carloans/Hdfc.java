package com.hdfc.loans.carloans;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdrawl();
				
				

	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("i am overriden withdrawl in HDFC");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("i am overriden deposit in HDFC");
	}

}