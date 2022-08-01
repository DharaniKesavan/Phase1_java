package Abstraction;

abstract class MNC{
	abstract void method1();
	abstract void method2();
	MNC(){
		System.out.println("This is parent constructor part");
	}
	void display1(){
		System.out.println("This is parent class MNC");
	}	
}
abstract class Infosys extends MNC{
	abstract void method2();
	void method1(){
		System.out.println("This is first abstract method");
	}
}
class Hello extends Infosys{
	void method2(){
		System.out.println("This is second abstract method");
	}
	void display(){
		System.out.println("This is child class Hello");
	}
}
public class Main{
	public static void main(String args[]){
		MNC m = new Hello();
		Hello h = new Hello();
		m.display1();
		m.method1();
		m.method2();
		h.display();
	}
}
