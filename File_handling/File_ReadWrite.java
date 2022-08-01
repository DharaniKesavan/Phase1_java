package File_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_ReadWrite {
	public static void main(String args[]) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message = ");
		String message = sc.nextLine();
		char[] array = new char[60];
		try{
            File f = new File("D:\\logic.txt"); 
            FileWriter wf = new FileWriter("D:\\logic.txt");
            wf.write(message);
            System.out.println("Data is written to the file.");
            
          
            FileReader input = new FileReader(f);
            input.read(array);          
            System.out.println("Data in the file:");
            System.out.println(array);
            
            input.close();
            wf.close();
            sc.close();
		}   
		catch(IOException e) {
		      e.getStackTrace();
		}
	}
}
