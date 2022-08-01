package Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashset_pgm {
	public static void main(String args[]){
		LinkedHashSet L1 = new LinkedHashSet();
		L1.add(5);
		L1.add(4);
		L1.add(8.8f);
		L1.add(6.5f);
		L1.add('D');
		L1.add('R');
		L1.add(true);
		System.out.println("LinkedHashSet for L1 object : "+L1);
		
		LinkedHashSet<Integer> L2 = new LinkedHashSet<Integer>();
		int p,q,r,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four random numbers for L2 = ");
		p = sc.nextInt();
		q = sc.nextInt();
		r = sc.nextInt();
		s = sc.nextInt();
		L2.add(p);
		L2.add(q);
		L2.add(r);
		L2.add(s);
		System.out.println("LinkedHashSet for L2 object : "+L2);
		sc.close();
	}
}
