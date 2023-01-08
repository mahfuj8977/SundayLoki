package com.upskill.java_2;

public class Assignment_2_9 {

	
		
		/* Problem9. Write a program to swap two string variables (Talen, Tech) and display result on the screen. */

		public static void main(String[] args) {
			myMethod();
		}
		public static void myMethod(){
			String a = "Talen";
			String b = "Tech";
			
			String swap = a;
			a = b;
			b = swap;
			
			System.out.println("Swap value a: "+a);
			System.out.println("Swap Value b: "+b);


		}


	}

}
