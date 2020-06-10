
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Abc e1 = new Abc();
		e1.setNum(101);				// To assign the values for private variables
		e1.setName("Muskaan");
		// For fetching we will use 
		System.out.println(e1.getNum() + ". " + e1.getName());
		
	}
	
}

class Abc
{
	private int num;
	private String name;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
