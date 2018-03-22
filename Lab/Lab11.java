/*
  Thomas Mak
  03/22/2018
  Co Sci 290
  Lab 11- Chapter 6, Exercise 17 Display matrix of 0's and 1's
*/

import java.util.Scanner;

public class Lab11{

  public static void main(String[] args){
    
    // Create Scanner
    Scanner input = new Scanner(System.in);
    
    // Prompt user to enter n
    System.out.println("Enter n: ");
    // Declaring variable
    int n = input.nextInt();
    // Calling method 
    printMatrix(n);
  
  }
  
  // Creating method 
  public static void printMatrix(int n){
    // Delcaring variable 
    int counter = 0;
    do { 
      for (int i = 0; i < n; i++){ 
        System.out.print((int)(Math.random() * 2)); // Generating random number
        System.out.print(" "); // Printing out spaces
      }
      System.out.println();
      counter++; // Increment counter 
    }while (counter < n);
    return; // return statement 
  }
  
} 

