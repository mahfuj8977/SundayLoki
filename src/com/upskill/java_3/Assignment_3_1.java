package com.upskill.java_3;

public class Assignment_3_1 {

	public static void main(String[] args) {
		
		
		
			
			/* Problem 01.	Write a class name BankAccount which has savings and checking class.     
			 * BankAccount class that has a name and an initial amount, which are both set in the constructor. 
			 * Also, it lets users make deposits. Note that the account name must be set when an account is created. 
			 * Demonstrates the account class hierarchy with output of:
																		a.	account name: savings
																		b.	initial amount: 10000
																		c.	new amount after deposit: 15000
																		d.	account name: checking
																		e.	initial amount: 20000
																		f.	new amount after deposit: 26000
																		g.	new amount after withdrawal: 23000     */
			 
			

			import java.util.Scanner;

			public class Problem1 {

				String accname;
				float amount;
				boolean bool;
				Scanner s = new Scanner(System.in);

				Problem1(String accname) {
					this.accname = accname;
					System.out.println("Account name: " + this.accname);
					System.out.print("Please Enter the initial ammount for this " + accname + " account: ");
					this.amount = s.nextFloat();
					if (this.amount <= 0) {
						bool = false;
					} else {
						System.out.println("Initial ammount: " + this.amount);
						bool = true;
					}
					while (bool==false) {
						System.out.println("Invalid amount! Try again..");
						System.out.print("Please Enter the initial ammount for this " + accname + " account: ");
						this.amount = s.nextFloat();
						if (this.amount > 0) {
							System.out.println("Initial ammount: " + this.amount);
							bool=true;
						}
					}
				}

				void deposit(float amount) {
					this.amount = this.amount + amount;
					System.out.println("new ammount after deposit: " + this.amount);
				}

				void withdraw(float amount) {
					if (this.amount < amount) {
						System.out.println("Insufficient Balance");
					} else {
						this.amount = this.amount - amount;
						System.out.println("new amount after withdrawal: " + this.amount);
					}
				}

				public static void main(String[] args) {
					Savings s = new Savings();
					s.deposit(5000);
					Checking c = new Checking();
					c.deposit(6000);
					c.withdraw(3000);
				}
			}

			class Savings extends Problem1 {

				Savings() {
					super("Savings");
				}
			}

			class Checking extends Problem1 {

				Checking() {
					super("Checking");
				}
			}

					
							

	


