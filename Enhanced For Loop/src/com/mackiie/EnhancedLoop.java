package com.mackiie;

public class EnhancedLoop {

	public static void main(String[] args) {
		int array[] = new int[10];
		
		for (int i=0; i<=(array.length-1); i++)
		{
			array[i]=i+1;
		}
		
		for (int i : array) //enhanced for loop directly call the value of that index
		{
			System.out.println(i);
		}

	}

}
