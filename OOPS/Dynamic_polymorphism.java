package OOPS;

class Shape{
	public void areaofshape(float x,float y){
		System.out.println("---------------------");	
	}
}
class Rectangle extends Shape{
	public void areaofshape(float l,float w){
		double area = l*w;
		System.out.println("Area of Rectangle = "+area);
	}
}
class Square extends Shape{
	public void areaofshape(float a1,float a2){
		double area = a1*a2;
		System.out.println("Area of Square = "+area);
	}	
}
class Triangle extends Shape{
	public void areaofshape(float b,float h){
		double area = 0.5*b*h;
		System.out.println("Area of Triangle = "+area);
	}
}
class Rhombus extends Shape{
	public void areaofshape(float d1,float d2){
		double area = 0.5*d1*d2;
		System.out.println("Area of Rhombus = "+area);
	}	
}
public class Dynamic_polymorphism{
	public static void main(String args[]){
		Shape s;
		s = new Rectangle();
		s.areaofshape(4.0f,2.0f);
		s = new Square();
		s.areaofshape(3f,3f);
		s = new Triangle();
		s.areaofshape(6.5f,8.0f);
		s = new Rhombus();
		s.areaofshape(5.0f,7.5f);	
	}
}

