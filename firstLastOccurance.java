import java.util.*;

public class firstLastOccurance {
	public static int first = -1;
	public static int last = -1;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char find = sc.next().charAt(0);
		firstLast(s, find, 0);
	}
	public static void firstLast(String s, char find, int index) {
		if (index == s.length()) {
			System.out.println("First occurence of "+ find + " is at "+ first + " Position");
			System.out.println("Last occurence of "+ find + " is at "+ last + " Position");
			return;
		}
		if (s.charAt(index) == find && first == -1) {
			first = index+1;
			last=index+1;
		}
		else if(s.charAt(index) == find || last == -1) {
			last = index+1;
		}
		firstLast(s, find, index+1);
		
	}
}
