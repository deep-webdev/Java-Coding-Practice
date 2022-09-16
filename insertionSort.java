import java.util.Arrays;

public class insertionSort {
	public static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {8,3,1,5,2,9};
		
		for (int i=1; i<arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			for (; (j>=0 && arr[j]> current); j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = current;
			System.out.println(Arrays.toString(arr));
		}
//		printArray(arr);
	}
	
	
}
