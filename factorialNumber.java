import java.util.*;

public class factorialNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = factorial(n);
		System.out.println(fact);
	}
	public static int factorial(int n) {
		if (n == 1 || n==0) {
			return 1;
		}
		return n * factorial(n-1);
	}
}
