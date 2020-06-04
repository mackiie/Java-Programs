import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean isPrime= true;
		
		for (int i=2; i<N; i++)
		{
			if(N%2==0)
			{
				isPrime= false;
				break;
			}
		}
		if(isPrime)
			System.out.println("Its a Prime NUmber");
		else
			System.out.println("Not a Prime Number");
	}

}
