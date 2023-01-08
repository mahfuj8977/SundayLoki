package com.upskill.java_3;

import com.upskill.java_3.Assignment_2_2.Problem2;

public class ASsignment_3_2 {

	public static void main(String[] args) {
		
		/* Problem 2.	Write a java program which will display 5 employee information (name, age, salary and addres.)*/

		public class Problem2 {
			static int count=1;
			Problem2(String name,int age,int salary,String address){
				System.out.println("Employee Number: "+count);
				System.out.println("Employee Name: "+name);
				System.out.println("Employee Age: "+age);
				System.out.println("Employee Salary: "+salary);
				System.out.println("Employee Address: "+address);
				count++;
				System.out.println("");
			}

			public static void main(String[] args) {
			
		
			}
				Problem2[] obj=new Problem2[5];
				obj[0]=new Problem2("Shohid",37,190000,"Flushing");
				obj[1]=new Problem2("Rasel",26,170000,"New Jersey");
				obj[2]=new Problem2("Juel",33,100000,"Jamaica");
				obj[3]=new Problem2("Jahangir",28,160000,"Jackson Heights");
				obj[4]=new Problem2("Zain",5,150000,"Jamaica");
			}

		

		

	


	}

}
