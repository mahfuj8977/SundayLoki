package com.upskill.java_3;

public class Assignment_3_4 {

	public static void main(String[] args) {
	
		
		/* Problem 4.	Write a java program that explains runtime polymorphism. */
	     package com.upskill.asssignment3;
	     
	     public class Problem4 {
			
			public static void main(String[] args) {
				
				Problem4 v1=new Problem4();
				v1.wheels();
				System.out.println("Run-Time PolyMorphism ->");
				Problem4 v2=new Truck();
				v2.wheels();
				Problem4 v3=new Car();
				v3.wheels();
				Problem4 v4=new Bike();
				v4.wheels();
				Problem4 v5=new BiCycle(); //BiCycle doesn't have wheel class so its upper class method is invoked!
				v5.wheels();
			}
			
			void wheels(){
				System.out.println("Every Vehicle have some wheels!");
			}
		}

		class Truck extends Problem4{
			void wheels(){
				System.out.println("Trucks have 6 wheels!");
			}
			class Car extends Problem4{
				void wheels(){
					System.out.println("Cars have 4 wheels!");
				}
			}

			class Bike extends Problem4{
				void wheels(){
					System.out.println("Bikes have 2 wheels!");
				}
			}

			class BiCycle extends Bike{
				


		}

	}


	}

}
