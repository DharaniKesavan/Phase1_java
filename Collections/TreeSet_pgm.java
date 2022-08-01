package Collections;

import java.util.TreeSet;

public class TreeSet_pgm {
	public static void main(String args[]){
		TreeSet<String> T = new TreeSet<String>();
		T.add("C++");
		T.add("Python");
		T.add("HTML");
		T.add("CSS");
		T.add("Java");
		T.add("AngularJS");
		System.out.println("Initial TreeSet : "+T);
		T.remove("C++");
		T.remove("CSS");
		System.out.println("After removing 2 languages from TreeSet : "+T);
		T.add("C");
		T.add("NodeJS");
		T.add("Ruby");
		System.out.println("After adding 3 languages to TreeSet : "+T);
		System.out.println("Is TreeSet contains 'Java' : "+T.contains("Java"));
		T.clear();
		System.out.println("After removing all elements from TreeSet : "+T);		
	}
}
