/*Multiple inheritance is not allowed in java and a class can only extend one parent

class. Interfaces provide a form of multiple inheritance. Interfaces are not classes,

however an interface can extend more than one parent interface.

Interfaces provide a form of multiple inheritance. A class can extend only one other class.

Interfaces are limited to public methods and constants with no implementation.*/


interface Abc

{
	void show();		//We cannot define the methods in interface but we can declare them.
}

class AbcImpl implements Abc{
	
	public void show() {
		System.out.println("In Show");
	}
}
public class DemoInterface1 {

	public static void main(String[] args) {
		Abc obj = new AbcImpl();			// Interface can not make an object but a clss can therefore class implements interface.
		obj.show();

	}

}
