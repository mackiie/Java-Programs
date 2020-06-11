
public class PolyDemo {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();

	}

}

class A
{
	public void show ()
	{
		System.out.println("In A const");
	}
	
	public void show(int i)									//This is Overloading
	{
		System.out.println("In A const Int");
	}
}


class B extends A
{
	public void show ()
	{
		System.out.println("In B const");					// This is Overridding
	}
}