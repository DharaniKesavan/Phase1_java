package Collections;

import java.util.ArrayList;

public class Arraylist_pgm {
	public static void main(String args[]){
		ArrayList<String> a = new ArrayList<String>();
		a.add("Mango");
		a.add("Apple");
		a.add("Orange");
		a.add("Banana");
		a.add("Watermelon");
		a.add("Strawberry");
		a.add("Chennai");
		a.add("Salem");
		a.add("Singing");
		a.add("Gardening");
		System.out.println("Arraylist = "+a);
		a.remove(9);
		System.out.println("After removing one hobby from Arraylist = "+a);
		System.out.println("Is Arraylist contains 'cricket' = "+a.contains("cricket"));
		a.remove(6);
		a.remove(3);
		System.out.println("After removing one city & one fruit from Arraylist = "+a);
		System.out.println("4th element in Arraylist = "+a.get(3));
		System.out.println("6th element in Arraylist = "+a.get(5));		
	}
}
