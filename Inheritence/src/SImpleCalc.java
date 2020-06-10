import java.util.Scanner;

public class SImpleCalc {

	public static void main(String[] args) {
		AddSubMul obj = new AddSubMul();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for num1: ");
		obj.num1 = sc.nextInt();
		System.out.println("");
		System.out.println("Enter value for num2: ");
		obj.num2 = sc.nextInt();
		System.out.println("");
		obj.add();
		System.out.println("Addition= " + obj.result);
		obj.sub();
		System.out.println("Subtraction= " + obj.result);
		obj.mul();
		System.out.println("Multiplication= " + obj.result);

	}

}
//Parent, super , base class
class Add								
{
	int num1, num2, result=0;
	public void add()
	{
		result = num1 + num2;
	}
}
 // Child , sub , derived class
class AddSub extends Add				// Single Level Inheritence
{
	public void sub()
	{
		result = num1 - num2;
	}
}

class AddSubMul extends AddSub				// Multi Level Inheritence
{
	public void mul()
	{
		result = num1 * num2;
	}
}