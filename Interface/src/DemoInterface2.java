//Whatif we donot have class to instantiate the interface

interface Abcd
{
	void show();
}
public class DemoInterface2 {

	public static void main(String[] args) {
		Abcd obj = new Abcd() {
			public void show()
			{
				System.out.println("in show");
			}
		};			//here we have used anonymous classes for instantiating the interface
		obj.show();
		
	}

}
