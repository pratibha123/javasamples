package com.hdfc.loans.carloans;

public class Firstclass {
 int a=20, b=30,c;
  public void addition()
  { 
	  c=a+b;
	  System.out.println("addition of a & b is" + c);
  }
  public void substraction()
  {
	  c=b-a; 
	  System.out.println("substraction of a & b is" + c);
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
Firstclass obj= new Firstclass();
obj.addition();
obj.substraction();
System.out.println(obj.c);
Firstclass obj1= new Firstclass();
obj1.addition();
obj1.substraction();
	}

}
