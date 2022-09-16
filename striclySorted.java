import java.util.*;

public class striclySorted {
	public static boolean isSorted(int[] arr, int idx) {
		if (idx == arr.length-1) {
			return true;
		}
		if (arr[idx] >= arr[idx+1]) {
			return false;
		}
		return isSorted(arr, idx+1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		boolean ans = isSorted(arr, 0);
		if (ans) {
			System.out.println("Array is Sorted");
		}else {
			System.out.println("Array is not Sorted");
		}
	}
}
