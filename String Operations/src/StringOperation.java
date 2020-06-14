import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		String s1, s2;
		System.out.println("Enter two Strings: ");
		Scanner sc = new Scanner(System.in);	
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		// Concatenation
		
		/*Method 1:
		String s3 = s1 + s2;
		System.out.println(s3);
		*/
		
		//Method 2
		String s3 = s1.concat(s2);
		System.out.println("Result of concatenation: " + s3);
		
		// Length of the String
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		System.out.println("Length of string 1: " + l1);
		System.out.println("Length of string 2: " + l2);
		
		// Convert first String to UPPERCASE
		s1 = s1.toUpperCase();
		
		System.out.println("Upper CASE of string 1: " + s1);
	}

}
