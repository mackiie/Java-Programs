import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t=n, r, s=0;
		
		while(n>0)
		{
			r= n%10;
			n= n/10;
			s= s + r*r*r;
		}
		if(t==s)
			System.out.println("Its an Arrmstrong Number");
		else
			System.out.println("Not an Armstrong Number");

	}

}
