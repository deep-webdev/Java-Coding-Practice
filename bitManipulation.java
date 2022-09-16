
public class bitManipulation {
	
	// For Get Bit (Perform AND operation)
//	public static void main(String args[]) {
//		int n = 5; // 0101
//		int pos = 2; 
//		int bitMask = 1<<pos; // 0001 << 2 ==> 0100 
//		
//		if ((n & bitMask) == 0) {
//			System.out.println("Bit was Zero");
//		} else {
//			System.out.println("Bit was One");
//		}
//	}
	
	// For Set Bit (Perform OR Operation)
//	public static void main(String args[]) {
//		int n = 5; // 0101
//		int pos = 1; 
//		int bitMask = 1 << pos; // 0001 << 1 ==> 0010
//		
//		int finalNumber = bitMask | n;
//		System.out.println("Final number after Setting up Bit "+ finalNumber);
//	}
	
	// For Clear Bit (Perform AND with NOT of BitMask Operation)
	public static void main(String args[]) {
		int n = 5;
		int pos = 2;
		int bitMask = 1 << pos;
		
		int newNumber = (~(bitMask) & n);
		System.out.println("New Number after clear bit at pos 2 "+ newNumber);
	}
}