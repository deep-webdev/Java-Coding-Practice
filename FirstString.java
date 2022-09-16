import java.util.*;

public class FirstString {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		System.out.println("Your name is "+ name);
		String firstName = "Deep";
		String lastName = "Deep";
	
		if (firstName == lastName) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println(firstName.compareTo(lastName));
		}
		// substring
		String Name = "My name is Deep Panchal";
		String sub = Name.substring(11, Name.length());
		System.out.println(sub);
		
	}
}
