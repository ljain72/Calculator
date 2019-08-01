package com.epsilon.training.sbcalculator.bo;

public class Calculator {
	private int ip1;
	private int ip2;
	public Calculator()
	{
		System.out.println("calculator instance getting created");
	}
	public int addition(int i,int j)
	{
		return i+j;
	}
	public int subtraction(int i,int j)
	{
		return i-j;
	}
	public int multiplication(int i,int j)
	{
		return i*j;
	}
	public int division(int i,int j)
	{
		return i/j;
	}
	public int modulo(int i,int j)
	{
		return i%j;
	}

}
