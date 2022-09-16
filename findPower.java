import java.util.*;

public class findPower {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int ans = power(x,n);
		System.out.println(ans);
	}
	public static int power(int x, int n) {
		// Time complexity is higher
//		if (n == 1) {
//			return x;
//		}
//		if (n == 0) {
//			return 1;
//		}
//		return x * power(x, n-1);
		if (n == 1) {
			return x;
		}
		if (n == 0) {
			return 1;
		}
		if (n % 2 == 0) {
			return power(x, n/2) * power(x, n/2);
		}
		else {
			return power(x, n/2) * power(x, n/2) * x;
		}
		
		
	}
}
