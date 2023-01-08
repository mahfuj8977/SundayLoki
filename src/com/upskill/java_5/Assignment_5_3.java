package com.upskill.java_5;

public class Assignment_5_3 {

	public static void main(String[] args) {
		
		
		//   3.	A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
		Write a method that detects if a string is a palindrome.
		Tip: Use word.charAt(i) to get the character at position i. //

		public boolean isPalindrome(String word) {
		int i1 = 0;
		int i2 = word.length() - 1;
		while (i2 > i1) {
		    if (word.charAt(i1) != word.charAt(i2)) {
		        return false;
		    }
		    ++i1;
		    --i2;
		}
		return true;


		}
	}


	}
}
