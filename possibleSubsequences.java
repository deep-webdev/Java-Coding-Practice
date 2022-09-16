import java.util.*;

public class possibleSubsequences {

	public static void subSequences(String str, int idx, String newStr) {
		if (idx == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		char currChar = str.charAt(idx);
		// to be in String
		subSequences(str, idx+1, newStr+currChar);
		// not to be in String
		subSequences(str, idx+1, newStr);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String newStr = "";
		subSequences(str, 0, newStr);
	}
}
