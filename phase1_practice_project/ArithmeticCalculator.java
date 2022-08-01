package phase1_practice_project;

import java.util.Scanner;

final public class ArithmeticCalculator {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of operands =  ");
		int no = sc.nextInt();
		System.out.println("Enter first operand =  ");
		double ans = sc.nextDouble();
		for(int i=1;i < no;i++){
			System.out.println("Enter next operand = ");
			double a = sc.nextDouble();
			System.out.println("Enter operation = ");// +,-,*,/
			char op = sc.next().charAt(0);
			
			switch(op){
			case '+' :
				ans = ans + a ;
				System.out.println("Addition result = "+ans);
				break;
			case '-' :
				ans = ans - a;
				System.out.println("Subtraction result = "+ans);
				break;
			case '*' :
				ans = ans * a;
				System.out.println("Multiplication result = "+ans);
				break;
			case '/' :
				ans = ans/a;
				System.out.println("Division result = "+ans);
				break;
			default:
				System.out.println("Invalid entry");
			}
		}
		sc.close();	
	}
}

