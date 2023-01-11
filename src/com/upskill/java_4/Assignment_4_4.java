package com.upskill.java_4;

public class Assignment_4_4 {

	public static void main1(String[] args) {
		
		
		//4. write a method to check leap year
		public class LqLeapYear {
			
		}
		

		public static void main(String[] args) {
			leapYear(2007);
		}
		private static void leapYear(int year) {
			
			boolean leap = false;
	        if(year % 4 == 0)
	        {
	            if( year % 100 == 0)
	            {
	                // year is divisible by 400, hence the year is a leap year
	                if ( year % 400 == 0)
	                    leap = true;
	                else
	                    leap = false;
	            }
	            else
	                leap = true;
	        }
	        else
	            leap = false;
	        if(leap)
	            System.out.println(year + " is a leap year.");
	        else
	            System.out.println(year + " is not a leap year.");

		//	masum
			
			
			

		


		
			
			
		}

	}

	}

}
