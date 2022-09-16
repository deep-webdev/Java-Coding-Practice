
public class quickSort {
	
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for (int j=low; j<high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}
	
	public static void quickSortFun(int arr[], int low, int high) {
		if (low < high) {
			
			int pidx = partition(arr, low, high);
			quickSortFun(arr, low, pidx-1);
			quickSortFun(arr, pidx+1, high);
			
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {6,3,5,8,1,4};
		int high = arr.length;
		quickSortFun(arr, 0, high-1);
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}
