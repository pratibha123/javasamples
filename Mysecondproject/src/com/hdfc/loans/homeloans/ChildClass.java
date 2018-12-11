package com.hdfc.loans.homeloans;

public class ChildClass extends FirstAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChildClass obj =new ChildClass(); 
 obj.m1();
 obj.m2();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println(" i am m1 overriden method  from childclass");
	}

}
