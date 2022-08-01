package ExceptionHandling;

import java.util.Scanner;

public class ThrowClause{
	
	 static int compare(int n1, int n2){ 
	      if (n1 != n2)
	         throw new ArithmeticException("n1 is not equal to n2");
	      else
	         return n1+n2;
	 }
	    
	 public static void main(String args[]){       
		   Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter n1 = ");
	       int n1 = sc.nextInt();
	       System.out.println("Enter n2 = ");
	       int n2 = sc.nextInt();
	      
	       try{
	    	  System.out.println("Addition = "+compare(n1,n2));
	       }
	       catch(ArithmeticException ae)
	       {
	    	   System.out.println("Error occured: "+ae.getMessage());
	       }
	       sc.close();
	   }
}


