/*
	Thomas Mak
	Co Sci 290
	04/12/2018
	Lab 12
	
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	Sample output with odd number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...
	Sample output with even number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...
	
	Note:
	Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/

import java.util.Scanner; // importing scanner since scanner was created already

public class Lab12{

	public static void main(String[] args){ // Adding [] 

    Scanner input = new Scanner(System.in); // Creating Scanner
	                                          // CAPS the S in System
    int num; // Declaring variable
	           // Changing char into Int because char is only used for letters

	  System.out.println("This program will check if a number" // Adding " to the beginning so it can print out the line
    	+ " is even or odd..."); 

	  System.out.println("Please enter in a whole number..."); // Adding ; at the end to complete the sentence 

	  num = input.nextInt(); // Prompt user to enter num
	                         // Removing int in front of num because num has already been defined
	                         // Adding Int behind "next" to show which kind of datatype is was defined as 

	  checkNums(num); // Calling method 
	                  // Adding an s after Num to be the correct title

	} // end of 1st method

	public static void checkNums(double num){ // Adding static into the title 
	
	  //oops...  still need to implement
if ( num % 2 == 0 ) // Getting user's number 	
         System.out.println("You entered an even number.");
      else
         System.out.println("You entered an odd number.");

	  } // end of 2nd method 
	  // Taking away on } because it was not neccessary 
} // end of main 