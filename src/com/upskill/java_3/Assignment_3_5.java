package com.upskill.java_3;

public class Assignment_3_5 {

	public static void main(String[] args) {
		
		
		/* Problem 5. Dingdong program : Write a Java program that prints the numbers from 1 to 50.  
		 *  * But for multiples of three prints "Ding" instead of the number and for the multiples of five prints "Dong". 
 * For numbers which are multiples of both three and five print "Dingdong" */

		class Problem5 {

			public void main(String[] args) {
				for (int i=1;i<=50;i++)
					if (i%3==0&&i%5==0){
						System.out.println("DingDong");
					}else if (i%3==0){
						System.out.println("Ding");
					}else if (i%5==0){
						System.out.println("Dong");
					}
					else
						System.out.println(i);
			}
		}

	}

}
