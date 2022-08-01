package phase2.modifier.p2;
import phase2.modifier.p2.ClassX;
import phase1.modifier.p1.ClassP;

public class ClassZ extends ClassP{
	public static void main(String args[]){
		ClassZ o5 = new ClassZ();
		o5.public_M();
		o5.protected_M();
		o5.public_N();
		o5.protected_N();
		o5.public_P();
		o5.protected_P();
		ClassX o6 = new ClassX();
		System.out.println("value of i="+o6.i);
		System.out.println("value of j="+o6.j);
		System.out.println("value of k="+o6.k);
	}
}
