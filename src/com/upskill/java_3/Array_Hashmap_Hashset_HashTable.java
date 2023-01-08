package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

import javax.print.DocFlavor.STRING;

public class Array_Hashmap_Hashset_HashTable {
	
	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 30;
		int[] ageLoki = new int[]{25,30,35,38,40};   //Variable
		                                             //Array
		//Array index           [0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageLoki[4]);
		System.out.println("Total Student :" + ageLoki.length);
		
	
		
		
		
		//Array index         [1] [2] [3] [4] [5]
		
		String [] nameLoki = new String[]{"Mahfuj", "Siful","Anik","joy","posherul"};
		System.out.println("Student Name :" + nameLoki[4]);
		System.out.println("Total Student name: " + nameLoki.length);
		
		
		
		//Multi_dimentional Array
		int[][] ageLoki2D = {{25,30,35,38,40},
				{25,30,35,}};                                  //[0][0] [0][1] [0][2] [0][3] [0][4]
				                                                //[1][0] [1][1] [1][2] [1][3] [1][4] 
				System.out.println("Student Age 2D : " + ageLoki2D[0][3]);
				
				
				//Hashmap store multiple data using key-valu pair, Implemntation,  of Map interface
				
				HashMap<String, Integer>Student = new HashMap<String,Integer>();
				  
				Student.put("Anik", 25);
				Student.put("Badsha", 30);
				Student.put("Mizu", 28);
				Student.put("Mahfuj" ,29);
				
				System.out.println("HashMap student Age:"+ Student.get("Mizu"));
						          
				HashMap<String, String> Capital = new HashMap<String, String>();
				
				Capital.put("BD", "Dhaka");
				Capital.put("Usa","Washington DC");
				System.out.println("Capital City :" + Capital.get("BD"));
				
				              
		      // Hashset store unordered collection containing unique value,Implemtationion of Set interface.
				
				HashSet<String> car = new HashSet<String>();
				car.add("BMW");
				car.add("Toyota");
				car.add("Audi");
				car.add("Ford");
				
				System.out.println("car :" + car);
				
				//HashTable store multiple data using key-value pair,but is synchronized (only one thread can be modified)
				
				
				Hashtable<String, String> Region =new Hashtable<String,String>();
				Region.put("BD", "Asia");
				Region.put("Usa", " America");
				System.out.println("Region:" + Region.get("BD"));
		
	}

}
 