package String;

public class StringBuffer_pgm {
	public static void main(String args[]){
		StringBuffer s = new StringBuffer("Started Java");
		
		s.append("Phase1");
		System.out.println("Append = "+s);
		s.delete(2,5);
		System.out.println("Delete = "+s);
		s.replace(5,9,"Python");
		System.out.println("Replace = "+s);
		s.insert(4, "language");
		System.out.println("Insert = "+s);
		s.reverse();
		System.out.println("Reverse = "+s);
		System.out.println("CharAt = "+s.charAt(9));
		System.out.println("Length = "+s.length());
	}
}
