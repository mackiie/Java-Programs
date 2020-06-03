package com.mackiie;

import java.util.Scanner;

public class Fibb {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n;
		System.out.println("Enter value of n: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i<=10; i++)
		{
			int k= a + b;
			a=b;
			b=k;
			System.out.println(k);
			
		}

	}

}
