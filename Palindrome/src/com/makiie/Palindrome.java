package com.makiie;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r, s=0, t=n;
		
		while (n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+3;
		}
		if (t==s)
			System.out.println("Its Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
