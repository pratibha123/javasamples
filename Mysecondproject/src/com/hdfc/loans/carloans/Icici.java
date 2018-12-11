package com.hdfc.loans.carloans;

public class Icici implements Rbi {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Icici i=new Icici();
		i.deposit();
i.withdrawl();
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("i am overriden by withdral in icici");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("i am overriden by deposit in icici");
	}

}
