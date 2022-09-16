import java.util.*;

public class allPermutations {
	
	public static void printPermutations(String str, String combination) {
		if (str.length() == 0) {
			System.out.println(combination);
			return;
		}
		
		for (int i=0;i<str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0,i) + str.substring(i+1);
			printPermutations(newStr, combination+currChar);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printPermutations(str, "");
	}
	
}
