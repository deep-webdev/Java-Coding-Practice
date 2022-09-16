import java.util.*;

public class uniqueSubsequences {
	
	public static void uniqueSubseq(String str, int idx, String newStr, HashSet <String>set) {
		if (idx == str.length()) {
			if (set.contains(newStr)) {
				return;
			} else {
				System.out.println(newStr);
				set.add(newStr);
				return;
			}
			
		}
		char currEle = str.charAt(idx);
		// to be present in String
		uniqueSubseq(str, idx+1, newStr+currEle, set);
		// not to be Present in string
		uniqueSubseq(str, idx+1, newStr, set);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		HashSet <String> set = new HashSet<> ();
		uniqueSubseq(str, 0, "", set);
	}
		
}
