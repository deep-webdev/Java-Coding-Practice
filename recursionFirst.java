import java.util.*;

public class recursionFirst {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = 1;
		int sum = 0;
		int n = sc.nextInt();
		printNumber(number, n, sum);
	}
	
	public static void printNumber(int number, int n, int sum) {
		if (number == n) {
			sum += number;
			System.out.println(sum);
			return;
		}
		sum = sum + number;
		printNumber(number + 1, n, sum);
	}
}
