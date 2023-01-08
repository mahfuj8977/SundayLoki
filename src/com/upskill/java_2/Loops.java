package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
     /*
      
      */
	  
      practiceForLoop();
      practiceWhileLoop();
      practiceDoWhileLoop();
      practiceInfiniteLoop();
      practiceNestedForLoop();
      
	}
       public static void practiceForLoop(){                   /// for Loop - Do again and again upto upper limit
    	   int i;                                              ///Initialize the variable
    	   for(i =- 1; i<10; i--){                              ///Setting lower limit, upper limit,increment or decrement
    		   System.out.println("For Loop number = " + i);  ///Statement
    	   }
       }
       public static void practiceWhileLoop(){                 ///while Loop- do again and again upto condition maatch
    	   int i = 1;                                           ///Initialize the variable
    	  
    	   while(i<=10){                                          /// setting Condition
    		   System.out.println("For Loop number = " + i);        ///Statement
    		  i++;                                                  // Increment or Decrement
    		   
    	   }
       }

           public static void practiceDoWhileLoop(){           //do While Loop- Do action then match condition
        	 int i = 1;                                       // Initialize the variable
        	 do{
        		 System.out.println("Do While Loop number = " + i);  //statement
        		 i++;                                                //Increment or Decrement
        	 } while (i<=100);                                      // checking condition
        	 }
           public static void practiceInfiniteLoop(){             // Infinite Loop- never ending Loop
        	   int i;                                            // initialize the variable
        	   for (i=1; ;i++){                                        // setting no upper limit
        		   System.out.println("Infinite Loops number  =" + i);  // Statement
        		   
        	   } 
           }
        	   public static void practiceNestedForLoop(){       ///Nested Loop- Loop inside another loop
        		   int i;                                         // Initialize i for loop 1
        		   int j;                                          // Initialize j for Loop j
        		   
        		   for (i=1; i<=10; i++){                         //    first Loop for i
        			   for (j=1; j<=10; j++){                        // second Loop for J 
        				   int multipicationTable = i * j;             //statement for looP 2
        				   System.out.print(multipicationTable + " ");
        			   }
        			   System.out.println(" ");                         // Statement for Loop 1
        				   
        			   }
        		   
        	   }
           }
           
