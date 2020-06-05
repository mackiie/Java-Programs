package com.mackiie;

public class TwoDArray {

	public static void main(String[] args) {
		int x[] = {5,6,7,9};
		int y[] = {6,2,8,4};
		int z[] = {8,9,2,6};
		
		int p[][]= {
						{5,6,7,9},
						{6,2,8,4},
						{8,9,2,6}
					};
		for(int i =0; i<3; i++)
		{
			for (int j =0; j<4; j++)
			{
				System.out.print(p[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		

	}

}
