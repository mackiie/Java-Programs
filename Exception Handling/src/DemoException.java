
public class DemoException {

	public static void main(String[] args) {
		//Unchecked exception
		
		int i, j ,k = 0;
		i = 8;
		j = 0;
		try
		{
			k=i/j;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println(k);
	}

}
