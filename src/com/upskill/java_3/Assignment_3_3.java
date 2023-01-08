package com.upskill.java_3;

public class Assignment_3_3 {

	public static void main(String[] args) {
		
		
		/* Problem 3.	Bank is a class that provides functionality to get interest rate.     
		 * Display different interest rate using rate functionality for Chase, City and TD banks followed by 8%, 7% and 9%. 
		 * Hints: using method override. */
		 
		 class Problem3 {
				
				void displayInterestRate(){
					System.out.println("Default interest rate is NONE");
				}

				public void main(String[] args) {
					Problem3 obj=new ChaseBank();
					obj.displayInterestRate();
					new CityBank().displayInterestRate();
					new TDBank().displayInterestRate();
				}
			}

			class ChaseBank extends Problem3{
				void displayInterestRate(){
					System.out.println("Chase Bank interest rate is 8%");
				}
			}

			class CityBank extends Problem3{
				void displayInterestRate(){
					System.out.println("City Bank interest rate is 7%");
				}
			}
           
			class TDBank extends Problem3{
				void displayInterestRate(){
					System.out.println("TD Bank interest rate is 9%");
				}

		 


	}




	}

}
