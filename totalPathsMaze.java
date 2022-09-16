import java.util.*;

public class totalPathsMaze {
	public static int totalPaths(int x, int y, int n, int m) {
		if(x == n || y == m) {
			return 0;
		}
		if (x == n-1 && y == m-1) {
			return 1;
		}
		
		int downPath = totalPaths(x+1, y, n, m);
		int rightPath = totalPaths(x, y+1, n, m);
		return downPath + rightPath;
	}
		
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = totalPaths(0, 0, n, m);
		System.out.println(count);
	}
}
