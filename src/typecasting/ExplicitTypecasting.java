package typecasting;

public class ExplicitTypecasting {
	public static void main(String args[]){
		//explicit typecasting
		double d1 = 43.56755489;
		System.out.println("double value of d1 = "+d1);
		int a1 = (int)d1;
		System.out.println("int value of d1 = "+a1);
		float f1 = (float)d1;
		System.out.println("float value of d1 = "+f1);
		long r1 = (long)d1;
		System.out.println("long value of d1 = "+r1);
		short s1 = (short)d1;
		System.out.println("short value of d1 = "+s1);
		
		float f2 = 32.4f;
		System.out.println("float value of f2 = "+f2);
		long r2 = (long)f2;
		System.out.println("long value of f2 = "+r2);
		int a2 = (int)f2;
		System.out.println("int value of f2 = "+a2);
		
		long r3 = 65321789933L;
		System.out.println("long value of r3 = "+r3);
		int a3 = (int)r3;
		System.out.println("int value of r3 = "+a3);
		short s2 = (short)r3;
		System.out.println("short value of r3 = "+s2);
		
		int a4 = 78;
		System.out.println("int value of a4 = "+a4);
		short s3 = (short)a4;
		System.out.println("short value of r3 = "+s3);
		char c = (char)a4;
		System.out.println("char value of a4 = "+c);
	}
}
