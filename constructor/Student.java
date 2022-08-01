package constructor;

public class Student{
	String name;
	int age;
	char section;
	char gender;
	int subject1,subject2,subject3;
	Student(String a,int b,char c,char d,int t1,int t2,int t3){
		name = a;
		age = b;
		section = c;
		gender = d;
		subject1 = t1;
		subject2 = t2;
		subject3 = t3;	
	}
	Student(String e,int f,char g,char h,int t4,int t5){
		name = e;
		age = f;
		section = g;
		gender = h;
		subject1 = 0;
		subject2 = t4;
		subject3 = t5;
	}
	void display(){
		System.out.println("Name of student = "+name);
		System.out.println("Age of student = "+age);
		System.out.println("Section of student = "+section);
		System.out.println("Gender of student = "+gender);
		int total = subject1+subject2+subject3;
		int per = (int)(((float)total/300)*100);
		System.out.println("Total marks = "+total);
		System.out.println("Percentage obtained = "+per);
		System.out.println("---------------------------------");		
	}
	
	public static void main(String args[]){
		Student s1 = new Student("Ram",20,'A','M',90,95,98);
		Student s2 = new Student("Rose",19,'A','F',89,93);
		Student s3 = new Student("Lily",20,'B','F',98,92);
		Student s4 = new Student("Raja",21,'B','M',80,83,95);
		s1.display();
		s2.display();
		s3.display();
		s4.display();		
	}
}
