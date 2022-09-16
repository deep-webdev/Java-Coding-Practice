import java.util.*;
public class fibonacciRecursion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		fibonacci(n-2, a,b);
	}
	public static void fibonacci(int n, int a, int b) {
		if (n == 0) return;
		int c = a + b;
		System.out.print(" "+c);
		fibonacci(n-1, b, c);
	}
}
