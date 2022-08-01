package ExceptionHandling;

import java.util.Scanner;

public class Check_salary {
	public static void custextn(int salary) throws Custom{
		if(salary<2100){
			throw new Custom("you need to work hard");
		}
		else if((2100<= salary)&&(salary<=5000)){
			throw new Custom("your salary is somehow good");
		}
		else if((5100<= salary)&&(salary<=9000)){
			throw new Custom("salary is very good");
		}
		else{
			System.out.println("Invalid entry");
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary = ");
		int salary = sc.nextInt();
		try{
			custextn(salary);
		}
		catch(Exception a){
			System.out.println("Message: "+a.getMessage());
		}
		sc.close();
	}
}
class Custom extends Exception{
	Custom(String s1){
	 super(s1); 
	}
	private static final long serialVersionUID = 1L;
}
