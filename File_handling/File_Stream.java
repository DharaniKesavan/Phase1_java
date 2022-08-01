package File_handling;

import java.io.BufferedOutputStream; 
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream; 
import java.io.IOException;
import java.util.Scanner; 


public class File_Stream{
	
  public static void main(String[] args) throws IOException { 
	
	try{
		
	  File f = new File("D:\\Simplilearn_course\\Topic_File_Handling\\Phase_1.txt");
	  if(f.exists()){
	  System.out.println("File Exists!");
	  }
	  else{
		  System.out.println("File Created!");
	  }
		  
	  System.out.println("Enter text (@ at the end):");
      DataInputStream dis=new DataInputStream(System.in); 
      FileOutputStream fout = new FileOutputStream("D:\\Simplilearn_course\\Topic_File_Handling\\Phase_1.txt",true); 
      BufferedOutputStream bout = new BufferedOutputStream(fout,1024);  
      char ch; 

      //read characters and write them into bout till it is not @ 
      while((ch=(char)dis.read())!='@') 
      {     	 
    	  bout.write(ch);          
      } 
      System.out.println("Successfully read the text and written it to the file!");
      System.out.println("                                            ");
      bout.close(); 
     
      //Want to append to a file
      System.out.println("Want to append any text----->click 'y'(yes)= ");
      System.out.println("Otherwise click other than 'y' = ");
      Scanner sc = new Scanner(System.in);
      char click = sc.next().charAt(0);     
      if(click == 'y')
    		  main(null);		 	  
      else
    	  System.out.println("EXIT");
      
    }
	  
	catch(Exception e){
		  e.getMessage();
	}
  }
}
