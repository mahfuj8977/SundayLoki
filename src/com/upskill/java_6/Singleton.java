package com.upskill.java_6;

public class Singleton {
	
	//Singleton is one class that can have only one object
	
	//privet constructor, privet obj ,it prevents any other class from instaniating
	
	private Singleton(){

	}
	//private static object of the classs
	private static Singleton SingletonObj = new Singleton();
	
   public static Singleton getInstance(){
      return SingletonObj;                                      //static facrorey method
   }
	protected static void demo(){
		System.out.println("Demo method for singletone class");
	}
}
	
	
