package constructor;

public class Shape {
	int sq,re;
	float ci;
	static float b;
	static float h;
	static int p;
	static int q;
	public Shape(){
		b = 5.0f;
		h = 6.0f;
		p = 3;
		q = 7;
	}
	public Shape(int a){
		 sq = a*a;
	}
	public Shape(int l, int w){
		 re = l*w;
	}
	public Shape(float r){
		ci = (float) (3.14*r*r);
	}
	
	public void display1(){
		System.out.println("area of square="+sq);
	}
	public void display2(){
		System.out.println("area of rectangle="+re);
	}
	public void display3(){
		System.out.println("area of circle="+ci);
	}	
	
	public void area(int p1,int q1){
		System.out.println("area of rhombus="+(0.5*p1*q1));		
	}
	public void area(float b1,float h1){
		System.out.println("area of triangle="+(0.5*b1*h1));
	}
	public static void main(String args[]){
		Shape s1 = new Shape(5);
		Shape s2 = new Shape(8,4);
		Shape s3 = new Shape(4.5f);
		Shape s4 = new Shape();
		s1.display1();
		s2.display2();
		s3.display3();
		s4.area(p,q);
		s4.area(b,h);
	}

}
