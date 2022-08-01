package ExceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class Area_Throws {

	static int display(int l,int b)throws IOException {
		if(l > b)
			throw new IOException("length is greater than breadth"); 
		else 
			return l*b;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length = ");
		int length = sc.nextInt();
		System.out.println("Enter breadth = ");
		int breadth = sc.nextInt();
		
		try{
		System.out.println("Area of rectangle = "+display(length,breadth));
		}
		catch(IOException io){
			System.out.println("Error occured: "+io.getMessage());
		}
		sc.close();
	}
}
