
public class DemoException2 {

	public static void main(String[] args) {
		int i, j ,k = 0;
		i = 8;
		j = 3;
		int a[] = new int[4];
		try
		{
			k=i/j;
			for (int c =0; c<=4; c++)
			{
				a[c] = c++;
				
			}
			for (int value : a)
			{
				System.out.println(value);
			}
		}
		catch (ArithmeticException e)
		{
			System.out.println("Cannot be divided by ZERO " + e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Maximum value is 4 ");
		}
		
		System.out.println(k);

	}

}
