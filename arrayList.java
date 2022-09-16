import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
	
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		// adding elements
		list.add(7);
		list.add(3);
		list.add(0);
		list.add(6);
		list2.add("Deep");
		list2.add("Mit");
		System.out.println(list2.getClass().getName());
		
		// get element 
		int element = list.get(1);
		System.out.println(element);
		
		// set element
		list.set(1,5);
		System.out.println(list);
		
		// add element at specific position
		list.add(0, 4);
		System.out.println(list);
		
		// remove element from list
		list.remove(4);
		System.out.println(list);
		
		// sorted array
		Collections.sort(list);
		System.out.println(list);
		
		// traverse through array
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
	}
}
