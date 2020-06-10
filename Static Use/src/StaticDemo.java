//static keyword helps us to prevent to make the instance for using the variable or method. Only we have to call it by the class.
//If we don't use static keyword then we cannot use the variable or method in the other class, also to use it we would need to make the object.
public class StaticDemo {

	public static void main(String[] args) {
		A.show();
		System.out.println("After using show method");
		A.i=7;
		System.out.println(A.i);
		
	}
	
}
class A
{
	static int i=5;
	public static void show() {
		System.out.println("Hii");
		System.out.println(i);
	}
}
