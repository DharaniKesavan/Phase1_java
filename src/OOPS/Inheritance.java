package OOPS;

		class Product {
			int id = 78;
			String name = "Amul";
			void display(){
			System.out.println("Id = "+id+"\n"+"Name = "+name);
			}
		}	
		class A extends Product{
			int count = 50;
			String category = "butter";
			void display1(){
				System.out.println("Id = "+id+"\n"+"Name = "+name);
				System.out.println("Count = "+count+"\n"+"Category = "+category);
			}
		}
		class B extends Product{
			int count = 90;
			String category = "Milk";
			void display1(){
				System.out.println("Id = "+id+"\n"+"Name = "+name);
				System.out.println("Count = "+count+"\n"+"Category = "+category);
			}
		}
		class C extends Product{
			int count = 56;
			String category = "choco";
			void display(){
				System.out.println("Id = "+id+"\n"+"Name = "+name);
				System.out.println("Count = "+count+"\n"+"Category = "+category);
			}	
		}
		class SubA extends A{
			int price = 30;
			void calculate(){
			int	total_price = count*price;
			System.out.println("Total price = "+total_price);
			System.out.println("Id = "+id+"\n"+"Name of product = "+name+"\n"+"Category = "+category);
			}
		}
		class SubB extends B{
			int price = 10;
			void calculate(){
			int	total_price = count*price;
			System.out.println("Total price = "+total_price);
			System.out.println("Id = "+id+"\n"+"Name of product = "+name+"\n"+"Category = "+category);
			}
		}
		
		public class Inheritance{
			public static void main(String args[]){
				SubA sa = new SubA();
				SubB sb = new SubB();
				C sc = new C();
				System.out.println("Display method of product class: ");
				sa.display();
				System.out.println("--------------------------------");
				System.out.println("Display method of A class: ");
				sa.display1();
				System.out.println("--------------------------------");
				System.out.println("Display method of SubA class: ");
				sa.calculate();
				System.out.println("--------------------------------");
				System.out.println("Display method of B class: ");
				sb.display1();
				System.out.println("--------------------------------");
				System.out.println("Display method of SubB class: ");
				sb.calculate();
				System.out.println("--------------------------------");
				System.out.println("Display method of C class: ");
				sc.display();
			}
		}

