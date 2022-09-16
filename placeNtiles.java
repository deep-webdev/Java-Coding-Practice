
public class placeNtiles {
	
	public static int placeTile(int n, int m) {
		if (n == m) {
			return 2;
		}
		if (n < m) {
			return 1;
		}
		//vertical
		int vertical = placeTile(n-m, m);
		//horizontal
		int horizontal = placeTile(n-1, m);
		
		return vertical + horizontal;
	}
		
	public static void main(String args[]) {
		int n = 4;
		int m = 2;
		int count = placeTile(n,m);
		System.out.println(count);
	}
}

