import java.util.Scanner;

public class IsPerfect {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = isPerfect(n);
		if(b)
		{
			System.out.println("Its Perfect");
		}
		else
			System.out.println("Not Perfect");
	}
	public static boolean isPerfect(int n)
	{
		int sum = 0;
		int i;
		for (i=1; i<=n-1; i++)
		{
			if (n%i==0)
			{
				sum=+i;
			}
		}
		if (n==sum)
			return true;
		
		return false;
		
	}

}
