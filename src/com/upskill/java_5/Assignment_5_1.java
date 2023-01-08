package com.upskill.java_5;

public class Assignment_5_1 {

	public static void main(String[] args) {
		
		
//		Write a method that returns the largest integer in the list. 
		//  You can assume that the list has at least one element.

	static int arr[] = {10, 324, 45, 90, 9808, 15}; 
	    
	    // Method to find maximum in arr[] 
	    static int largest() 
	    { 
	        int i; 
	          
	        // Initialize maximum element 
	        int max = arr[0]; 
	       
	        // Traverse array elements from second and 
	        // compare every element with current max   
	        for (i = 1; i < arr.length; i++) 
	            if (arr[i] > max) 
	                max = arr[i]; 
	       
	        return max; 
	    } 
	      
	    // Driver method 
	    
	    { 
	        System.out.println("Largest in given array is : " + largest()); 
	    } 
	
		  
		
		
	}



	


