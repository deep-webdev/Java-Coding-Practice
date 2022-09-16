import java.util.*;

public class arrayPractice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] marks = new int[size];
		for (int i=0; i<size; i++) {
			marks[i] = sc.nextInt();
		}
		int search = sc.nextInt();
		for(int i=0; i<	size; i++) {
			if (marks[i] == search) {
				System.out.println("Number found at position" + " " +i);
				return;
			}
		}
		System.out.println("Number not found");
	}
}
