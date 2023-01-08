package com.upskill.java_1;

public class Variables { 
	
//  Variables in java
	
	public String country = "USA";    // Instance OR global variable - Variable declared in class level,outside method
	
	public String country2 = "Russia"; 
	
	public static String region = "America"; //Static  variable - variables belong to class and don't required creating object
	
   
    public static void main(String[] args) {
		
          String city = "New York";          // Local variable - veriables declared in methods
          
          method("Essex");
    }        
	
    public static void method(String county){      // Method parameter - variables used as method parameter 
    	                                           //method data brought outside to inside
    	String city = "Bloomfrild";
    	
    	String mycounty = county;
    	System.out.println(county);
    }
}
