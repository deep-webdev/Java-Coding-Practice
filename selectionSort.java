
public class selectionSort {
	public static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {5,4,6,10,2,1};
		for (int i=0; i<arr.length-1; i++) { // n-1 times 
			int min = i;
			for (int j=i+1; j<arr.length; j++) { // n, n-1, n-2, ...., 1 
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		printArray(arr);
	}
}

// Time Complexity for Selection sort ==> O(n^2)
// Not used in competitive programming because of more time consuming sort algorithm...