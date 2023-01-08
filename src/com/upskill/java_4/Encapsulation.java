package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	
	
	private String name = "upskill";       //write & read
	
	private int ssn = 456657778;           //write only
	private String username = "mahfuj";    //read only
	
	//setter Method -naame                 //set the data,write
	
	public void setName(String value){
		name = value;
	}
      //Gerter Method - name
	public String getName(){           //get the data,Read
		return name;
		
	}
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
	
		
		
		obj.setName("upskill2");
		System.out.println(obj.getName());  
		
	}
		
		//setter Method -ssn 
		public void setssn(int value){
			ssn = value;
		} 
	      //Gerter Method - name
		public String getuserName(){           //get the data,Read
			return username;
		}
		public static void main(String[] args) {
			Encapsulation obj = new Encapsulation();
			
			obj.setName("upskill2");
			System.out.println(obj.getName());
			 obj.setSSN( 456657778);
			 
			 System.out.println(obj.getUserName());
			 
		}
			
			
			
		
			
			
		
		
		
				
		
		
		

	}


