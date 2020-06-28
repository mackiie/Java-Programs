
public class DemoAbstraction {

	public static void main(String[] args) {
		MaheshPhone obj = new SureshPhone();
		
		obj.call();
		obj.move();
		obj.cook();
		obj.dance();

	}

}

abstract class MaheshPhone					//Abstract class
{
	public void call(){
		System.out.println("Calling....");		
	}
	
	public abstract void move();					//Abstract Methods 
	//whenever we have abstract methods it compulsory to make the abstract class but when we have abstract class it's not compulsory to have abstract methods
	//Also we can have both abstract method and normal methods in a abstract class.
	public abstract void dance();
	public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone{
	public void move() {
		System.out.println("Moving....");
	}
	public void dance()
	{
		System.out.println("Dancing....");
	}
	public abstract void cook();
}

class SureshPhone extends RameshPhone{
	public void cook() {
		System.out.println("Moving....");
	}
}
