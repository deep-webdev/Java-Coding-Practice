import java.util.*;

public class firstPattern {
	static int n1=0,n2=1,n3;
	public static void fibbonacci(int a){    
	    if(a>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         fibbonacci(a-1);    
	     }    
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(n1+" "+n2);
		fibbonacci(a-2);
	}
}
