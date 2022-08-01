package example_program;

public class AreaofRect {
	public int area(int l,int b){
		int a = l*b;
		return a;
	}
	public static void main(String args[]){
		AreaofRect ar = new AreaofRect();
		int ans = ar.area(5,4);
		System.out.println("Area of Rectangle = "+ans);
	}

}
