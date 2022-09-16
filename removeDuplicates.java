import java.util.*;

public class removeDuplicates {
	public static boolean [] map = new boolean[26];
 	
	public static void remDuplicates(String str, int len, String newStr) {
		if (len == str.length()) {
			System.out.println("New String After removing all Duplicates: " + newStr);
			return;
		}
		char currChar = str.charAt(len);
		if (map[currChar - 'a'] == true) {
			remDuplicates(str, len+1, newStr);
		}
		else {
			newStr += currChar;
			map[currChar - 'a'] = true;
			remDuplicates(str, len+1, newStr);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String newStr = "";
		remDuplicates(str, 0, newStr);
	}
}
