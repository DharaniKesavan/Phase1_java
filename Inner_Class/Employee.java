package Inner_Class;

public class Employee{
	static int salary = 15000;
	class PermEmployee{
		String code = "PE01";
		float hike = 0.45f;
		void new_salary(int salary){
			System.out.println("Permanent employee:");
			System.out.println("New salary = "+(salary+(salary * hike)));	
		}
		void display(){
			System.out.println("salary = "+salary+"\n"+"code = "+code+"\n"+"hike = "+hike);
			System.out.println("---------------------");
		}
	}
	class TempEmployee{
		String code = "TE01";
		float hike = 0.30f;
		void new_salary(int salary){
			System.out.println("Temporary employee:");
			System.out.println("New salary = "+(salary+(salary * hike)));	
		}
		void display(){
			System.out.println("salary = "+salary+"\n"+"code = "+code+"\n"+"hike = "+hike);
			System.out.println("---------------------");
		}
	}
	void role(){
		class ContractEmployee{
			String code = "CE01";
			float hike = 0.30f;
			void new_salary(int salary){
				System.out.println("Contract employee:");
				System.out.println("New salary = "+(salary+(salary * hike)));	
			}
			void display(){
				System.out.println("salary = "+salary+"\n"+"code = "+code+"\n"+"hike = "+hike);
				System.out.println("---------------------");
			}
		}
		ContractEmployee ce = new ContractEmployee();
		ce.new_salary(salary);
		ce.display();
	}
	public static void main(String args[]){
		Employee e1 = new Employee();
		Employee.PermEmployee pe = e1.new PermEmployee(); 
		Employee.TempEmployee te = e1.new TempEmployee(); 
		pe.new_salary(salary);
		pe.display();
		te.new_salary(salary);
		te.display();
		e1.role();
	}
}
