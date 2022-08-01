package Abstraction;

abstract class Vehicle{
	abstract void run();	
	abstract void stop();
	int speed = 50;
	long distance = 78921;
	public void fuel(int a){
		System.out.println("var1 = "+a);
	}
	public void fuel(float b,String c){
		System.out.println("var2 = "+b+"\n"+"var3 = "+c);
	}
	public void fuel(char d,int e){
		System.out.println("var4 = "+d+"\n"+"var5 = "+e);
	}
	Vehicle(){
		System.out.println("This is Vehicle default constructor");
	}
	Vehicle (int s,int d){
		System.out.println("This is Vehicle parameterized constructor");
	}
}
//---------------------------------------------------------------------------------
class TwoWheeler extends Vehicle{
	void run(){
		System.out.println("This is override run method");
	}
	void stop(){
		System.out.println("This is override stop method");
	}
	TwoWheeler(){
		System.out.println("This is TwoWheeler default constructor");
	}
	int speed = 45;
	long distance = 73281;
	int nos_of_tyre = 2;
	void display(){
		System.out.println("variables of 2W class: ");
		System.out.println("Speed = "+speed+"\n"+"Distance = "+distance+"\n"+"No of tyre = "+nos_of_tyre);
		System.out.println("----------------------------------------");
		System.out.println("variables of Vehicle class : ");
		System.out.println("Speed = "+super.speed+"\n"+"Distance = "+super.distance);
	}
}
public class Problem {
	public static void main(String args[]){
		Vehicle v = new TwoWheeler();
		TwoWheeler t = new TwoWheeler();
		t.display();
		v.fuel(5);
		v.fuel(6.0f,"BIKE");
		v.fuel('K',3);
		v.run();
		v.stop();
	}
}
