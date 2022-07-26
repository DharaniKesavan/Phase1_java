package phase1_practice_project;

import java.util.Scanner;

public class Validation_Email {
	
	public void searchID(String search,String email[]){
		boolean ans = false;
	    for(int  i=0;i<(email.length);i++){
	    	if(email[i].equals(search)){
	    		ans = true;
	    		break;
	    	}	
	    }
	    if(ans == true)
	    	System.out.println("Validated emailID");
	    else
	    	System.out.println("Invalid emailID"); 
	}
	
	public static void main(String args[]){
		String email[]= {"ram@email.com","mani.2001@email.com",
				           "shiva@email.com","lily.m@email.com",
				           "asha@email.com","divya152@email.com",
				           "sudhi@email.com","kamali99@email.com",
				           "dharu_19@email.com","devi@email.com"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email ID to be searched  = ");
		String search = sc.nextLine(); 
		sc.close();
		Validation_Email ve = new Validation_Email();
		ve.searchID(search,email);
    }
}

