package com.upskill.java_6;

public class MultithreadingThread extends Thread {
	

	   public void run(){
		   try{
			 System.out.println("Thread Number # " + Thread.currentThread().getId() + " is Running");
		   }catch (Exception e){
			   System.out.println("Exception is caught");
		   
		   }
	   }

}
