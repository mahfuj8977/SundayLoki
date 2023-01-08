package com.upskill.java_5;

public class Assignment_5_4 {

	public static void main(String[] args) {
		
		
		// 4.	The Ceasar cipher is a basic encryption technique used by Julius
		 Ceasar to securely communicate with his generals. Each letter is replaced by another letter N 
		 positions down the english alphabet. For example, for a rotation of 5, the letter 'c' would be replaced by an 'h'. 
		 In case of a 'z', the alphabet rotates and it is transformed into a 'd'.//
		 
		 
		Implement a decoder for the Ceasar cipher where N = 5.
		TIP: Use code.toCharArray() to get an array of characters.
				public String decode(String code) {
		String decoded = "";
		int lastCharValue = 'z';
		int alphabetLength = 'z' - 'a' + 1;
		for (char character: code.toCharArray()) {
		    int charNoRotation = character + 5;
		    int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
		    decoded += (char) charValue;}
		return decoded;		}


	


	}

}
