package com.mackiie;

public class Const {

	public static void main(String[] args) {
		
		Abc obj = new Abc(6); //constructor calling int parameter
		
	}
	
}
class Abc
{
	public Abc()			//Contsructor Overloading
	{
		System.out.println("In Abc Const");
	}
	public Abc(int i)
	{
		System.out.println("In Abc Const int");
	}
	public Abc(int i, double d)
	{
		System.out.println("In Abc Const intfloat");
	}
}
