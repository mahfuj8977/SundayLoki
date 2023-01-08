     package com.upskill.java_2;

     public class Assignment_2_10


		
/* Problem10. Write a Java program to convert temperature from Fahrenheit to Celsius degree.  */

		
		import java.util.Scanner;
	
			
		

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the Degree Fahrenheit: ");
				double a = s.nextInt();
				s.close();
				myMethod(a);
			}
			public static void myMethod(double a) {
				double fahrenheit = 0;
				double celsius = (fahrenheit - 32) * 5.0 / 9.0;

				System.out.println("The Equivalent of celsius is: ");
				System.out.println(celsius);



	}

}
