
public class CountObjects {

	public static void main(String[] args) {
		
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		obj1.counter();
	}

}

class A
{
	static int i;
	public A() {
		i++;
	}
	
	public void counter()
	{
		System.out.println("Number of objects are: " + i);
	}
}
