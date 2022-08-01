package phase1.modifier.p1;
import phase1.modifier.p1.ClassN;

public class ClassP extends ClassN {
	public void public_P(){
		 System.out.println("this is public class of classP");
	 }
	 void default_P(){
		 System.out.println("this is default class of classP");
	 }
	 protected void protected_P(){
		 System.out.println("this is protected class of classP");
	 }
	 private void private_P(){
		 System.out.println("this is private class of classP");
	 }
	public static void main(String args[]){
		ClassM o1 = new ClassM();
		System.out.println("ClassM variables:----");
		System.out.println("value of b="+o1.b);
		System.out.println("value of c="+o1.c);
		ClassN o2 = new ClassN();
		System.out.println("ClassN variables:----");
		System.out.println("value of e="+o2.e);
		System.out.println("value of f="+o2.f);
		System.out.println("value of g="+o2.g);
	}

}
