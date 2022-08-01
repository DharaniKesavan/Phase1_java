package typecasting;

public class ImplicitTypecasting {
	public static void main(String args[]){
		//implicit typecasting
		short s = 45;
		System.out.println("short value of s = "+s);
		long t = s;
		System.out.println("long value of s = "+t);
		double u = s;
		System.out.println("double value of s = "+u);
		
		char c1 = 'R';
		System.out.println("char value of c1 = "+c1);
		int a = c1;
		System.out.println("int value of character c1 = "+a);
		char c2 = 'm';
		System.out.println("char value of c2 = "+c2);
		float b = c2;
		System.out.println("float value of character c2 = "+b);
		
		int age = 50;
		System.out.println("int value of age = "+age);
		long l = age;
		System.out.println("long value of age = "+l);
		float f1 = age;
		System.out.println("float value of  age = "+f1);
		double d1 = age;
		System.out.println("double value of  age = "+d1);
		
		long dis = 879545678L; 
		System.out.println("long value of dis = "+dis);
		float f2 = dis;
		System.out.println("float value of dis = "+f2);
		double d2 = dis;
		System.out.println("double value of dis = "+d2);
		
		float f3 = 67.9f;
		System.out.println("float value of f = "+f3);
		double d3 = f3;
		System.out.println("double value of f = "+d3);
		}
}
