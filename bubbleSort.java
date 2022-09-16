
public class bubbleSort {
	public static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {7,8,9,1,5,10};
		for (int i=0; i<arr.length-1; i++) {  // n-1 times 
			for (int j=0; j<arr.length-i-1; j++) { // n , n-1, n-2, ...., 1 
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArray(arr);
	}
}

// Time complexity for Bubble sort ==> O(n^2)
// Not used in competitive programming because of more time consuming sort algorithm... 