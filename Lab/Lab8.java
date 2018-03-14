/* 
  Thomas Mak
  Co Sci 290
  03/13/2018
  Chapter 6, Exercise 6
*/

import java.util.Scanner;

public class Lab8{
  
  public static void main(String[] args){
  
    // Create Scanner
    Scanner input = new Scanner(System.in);
    
    // Prompt user to enter integer number 
    System.out.println("Enter an integer number" );
    // Display result 
    System.out.println("The sum of all its digits: " + sumDigits(input.nextLong()));
    
  }
  
  // Create method 
  public static int sumDigits(long n){
    
    // Declare variable
    int sum = 0;
    
    // A loop to scan over the user number 
    while (n > 0){
      
      // To extract the user number 
      sum += n % 10;
      
      // To remove the extracted user number
      n /= 10;
    }
    // Return and display the sum 
    return sum;
    
  }
  
}