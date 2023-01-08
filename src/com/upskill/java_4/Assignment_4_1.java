package com.upskill.java_4;

public class Assignment_4_1 {

	public static void main(String[] args) {
	  
		
	//	1.	Write a USER PROGRAM using encapsulation that contains the username, password, email, 
	     first and last name of the user of our application.Display the user informationin console output.//
	
	class Encapsulate {
		private String username = "Juel";
		private String password = "test";
		private String email = "juel@upskill.com";
		private String first_name = "Mohammad";
		private String last_name = "Haq";

		void display() {
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);
			System.out.println("Email: " + email);
			System.out.println("First name: " + first_name);
			System.out.println("Last name: " + last_name);
		}
	}

	}

}
