import java.util.*;
public class moveXtoLast {
	
	public static void moveAllx(String str, int idx, String newStr, int count) {
		if (idx == str.length()) {
			for (int i=0;i<count; i++) {
				newStr += 'x';
			}
			System.out.println("New String after Move all X's "+ newStr);
			return;
		}
		if (str.charAt(idx) == 'x' || str.charAt(idx) == 'X') {
			count ++;
		} else {
			newStr += (str.charAt(idx));
		}
		moveAllx(str, idx+1, newStr, count);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		moveAllx(str, 0, "", 0);
	}
}
