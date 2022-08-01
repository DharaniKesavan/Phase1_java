package ExceptionHandling;

import java.io.IOException;  

public class Throws_eg { 
		
	  void tech1() throws IOException{  
	    throw new IOException("Technical error in the platform"); 
	  }  
	  
	  void tech2() throws IOException{  
	    tech1();  
	  }  
	  
	  void tech3(){  
		  try{  
			  tech2();  
		  }
		  catch(IOException io){
			  System.out.println("Exception comes to Catch block");
			  System.out.println("Error occured : "+io.getMessage());
			  System.out.println(io.getStackTrace());
			  System.out.println(io.getClass());
		  }  
	  }  
	  
	  public static void main(String args[]){  
		   Throws_eg t = new Throws_eg();  
		   t.tech3();   
	  }  
}  
