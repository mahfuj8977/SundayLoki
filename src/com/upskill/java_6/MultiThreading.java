package com.upskill.java_6;

public class MultiThreading {
	
	/*  MultiThreading is a java feature that allow concurrent excution of two or more parts of a program
	 * Threads can be created by using two mechanisam :
	 * 
	 * 1.Extending the Thread class
	 * 2.Implementing the RunnAble Interface
	 */
	
	public static void main(String[]args) {
		
		int n = 5;
		for (int i = 0; i < n; i++){
			MultithreadingThread obj = new MultithreadingThread();
					obj.start();
			
					Thread obj2 = new Thread (new MultithreadingRunablethread));
					obj2.start();
					
		}
		
		
	}

}
