
public class Patter1 {

	public static void main(String[] args) {
		for (int i = 1; i<=5 ; i++)
		{
			for (int j=1; j<=i ;j++)
			{
				if(j==i || i%2==1)
				{
					System.out.print("1" + " ");
				}
				else
					System.out.print("0" + " ");
			}
			System.out.println(" ");
		}

	}

}