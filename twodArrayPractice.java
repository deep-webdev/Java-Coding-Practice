import java.util.*;

public class twodArrayPractice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int [][] matrix = new int [rows][cols];
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int search = sc.nextInt();
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				if (matrix[i][j] == search) {
					System.out.println("Number found at..." + "(" + i + ","+ j + ")");
					break;
				}
			}
		}
		System.out.println("Number is not available in matrix");
		
	}
}

