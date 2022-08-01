package ExceptionHandling;

public class Exception_example {
	public static void main(String args[]){
		int n1 = 50;
		int n2 = 0;
		int n3;
		try{
			n3 = n1/n2;
		}
		catch(ArithmeticException ae){
			System.out.println("Exception comes to catch block");
			System.out.println(ae.getMessage());			
		}
		catch (Exception a1){						//parent exception
			System.out.println("This is parent exception");
		}
		finally{
			n3 = n1+n2;
			System.out.println("Execution comes to finally block");			
		}
		System.out.println("Addition = "+n3);
	}
}
