package AkLabPkg;

public class Calculator {
	public void Add() {
		int a=20,b=5,c;
		c=a+b;
		System.out.println("The sum of two numbers are:"+c);
	}
	public void Sub() {
		int a=40,b=20,c;
		c=a-b;
		System.out.println("The diffrence of two numbers are:"+c);
	}
   
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calculator num1 = new Calculator();
		Calculator num2 = new Calculator();
		num1.Add();
		num2.Sub();
	}

}