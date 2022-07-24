package method_overloading;

public class Area {
	public int calculate(int a,int b){
		int c = a+b;
		return c;
	}
	public int calculate(float r){
		int aoc =  (int)(3.14*r*r);
		return aoc;
	}
	public int calculate(float l,float w){
		int aor = (int)(l*w);
		return aor;
	}
	public int calculate(int s){
		int aos = s*s;
		return aos;
	}
	public static void main(String args[]){
		Area ob = new Area();
		System.out.println("Addition of two integers = "+ob.calculate(5,3));
		System.out.println("Area of circle = "+ob.calculate(5.0f));
		System.out.println("Area of rectangle = "+ob.calculate(4.2f,3.0f));
		System.out.println("Area of square = "+ob.calculate(2));
	}
}
