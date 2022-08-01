package File_handling;
import java.io.File;
import java.io.IOException;

public class Filesample {
	public static void main(String args[]){
		  try{
            File file = new File("C:\\Users\\Monisha\\Downloads\\ReleaseNotes_git_files\\holiday.txt"); 
            
            if (file.createNewFile()) 
                System.out.println("New File is created");  
            else {                   
                if(file.exists())
                {
                    System.out.println("File already exists.");	
                    System.out.println("File path:" + file.getAbsolutePath());
                    System.out.println("File name:  " + file.getName());
                    System.out.println("File class:  " + file.getClass());
                    System.out.println("File parent:  " + file.getParent());
                    System.out.println("File space allocated:  " + file.getUsableSpace());
                    System.out.println("File length: " + file.length());
                    System.out.println("File list:   " + file.list());
                    System.out.println("File is readable: " +file.canRead());
                    System.out.println("File is writeable: " +file.canWrite());
                    System.out.println("Directory:  " + file.mkdir());    
                }
                else
                {
                	System.out.println("File doesnot exists.");
                }
               
                //--------------Delete the file code below-------------//
                boolean b = file.delete();
                if(b==true)
                	System.out.println("File deleted");
                else
                	System.out.println("File not deleted");
            }
		  }   
          catch (IOException e) {  
	          e.printStackTrace();  
	      }  	  
	 }
}