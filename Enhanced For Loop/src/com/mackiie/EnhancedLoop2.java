package com.mackiie;

import java.util.Random;

public class EnhancedLoop2 {

	public static void main(String[] args) {
		Random r = new Random();
		int array[] = new int[50];
		
		
		for (int i=0; i<=(array.length-1); i++)
		{
			array[i]=r.nextInt(50);
		}
		
		try
		{
			System.out.println(array[52]);		
		}
		catch (Exception e)
		{
			System.out.println("Maximux index number is 49");
		}
			
		/*for (int i : array) //enhanced for loop directly call the value of that index
		{
			System.out.println(i);
		}*/
	}

}
