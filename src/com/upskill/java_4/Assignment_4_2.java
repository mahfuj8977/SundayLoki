package com.upskill.java_4;

public class Assignment_4_2 {

	public static void main(String[] args) {
		
		
	// 2. write a method which will reverse a string *//
		
		public static void main(String[] args) {
			reverseString("Rasel");
		}
		
		public static void reverseString(String input){
			  
	        // getBytes() method to convert string  
	        // into bytes[]. 
	        byte [] strAsByteArray = input.getBytes(); 
	  
	        byte [] result =  new byte [strAsByteArray.length]; 
	  
	        // Store result in reverse order into the 
	        // result byte[] 
	        
	        
	        for (int i = 0; i<strAsByteArray.length; i++) 
	        	
	            result[i] = strAsByteArray[strAsByteArray.length-i-1]; 
	     // strAsByteArray, 0=R, 1=A, 2=S, 3=E, 4=L
        	// result, 0=L, 1=E, 2=S, 3=A, 4=R
	  
	        System.out.println(new String(result));
		}


	


	}

	private static void reverseString(String string) {
		// TODO Auto-generated method stub
		
	}

}
