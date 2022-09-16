import java.util.*;

public class reverseStringRecursion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length()-1;
		printReverse(str, len);
	};
	public static void printReverse(String str, int len) {
		if (len == 0) {
			System.out.println(str.charAt(len));
			return;
		}
		System.out.println(str.charAt(len));
		printReverse(str, len-1);
	}
}
