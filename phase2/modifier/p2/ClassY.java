package phase2.modifier.p2;
import phase2.modifier.p2.ClassX;
import phase1.modifier.p1.ClassN;

public class ClassY extends ClassN{
	public static void main(String args[]){
		ClassX o3 = new ClassX();
		System.out.println("value of i="+o3.i);
		System.out.println("value of j="+o3.j);
		System.out.println("value of k="+o3.k);
		ClassY o4 = new ClassY();
		o4.public_M();
		o4.protected_M();
		o4.public_N();
		o4.protected_N();		
	}
}

