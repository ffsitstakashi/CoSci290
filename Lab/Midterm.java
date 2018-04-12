/*
  Thomas Mak
  Co Sci 290
  03/27/2018
  Midterm
*/

import java.util.Scanner;

public class Midterm{

  public static void main(String[] args){
  
  // Create Scanner
  Scanner input = new Scanner(System.in);
  Scanner in = new Scanner(System.in);
    
    // Declaring variables
    int n = 0; 
    int j = 0;
    int c, d;
    // Prompt user to enter 1st matrix
    System.out.print("Enter n for 1st matrix: ");
    n = input.nextInt();
    // Prompt user to enter 2nd matrix
    System.out.print("Enter j for 2nd matrix: ");
    j = input.nextInt();
    // Calling 1st method 
    printMatrix(n);
    System.out.println(" "); // Printing out a blank line
    // Calling 2nd method 
    printMatrixx(j);
    
    System.out.println(" "); //Printing out a blank line
    // Prompt user to copy numbers 
    System.out.println("Copy the numbers from above: ");
    
    int first[][] = new int[n][j]; // first iteration
    int second[][] = new int[n][j]; // second iteration
    int sum[][] = new int[n][j]; // the sum of the matrix 
    
    // Looping the numbers together to find the sum of the matrix 
    for (  c = 0 ; c < n ; c++ )
      for ( d = 0 ; d < j ; d++ )
        first[c][d] = in.nextInt();
    
    for ( c = 0 ; c < n ; c++ )
      for ( d = 0 ; d < j ; d++ )
        second[c][d] = in.nextInt();
 
    for ( c = 0 ; c < n ; c++ )
      for ( d = 0 ; d < j ; d++ )
        sum[c][d] = first[c][d] + second[c][d];  // the addition matrix
        //sum [c][d] = first[c][d] * second[c][d]; // the multiplication matrix
    
    // Display the results
    System.out.println("Sum of entered matrices:-");
    for ( c = 0 ; c < n ; c++ ) {
      for ( d = 0 ; d < j ; d++ )
        System.out.print(sum[c][d]+"\t");
        System.out.println();
      }
    
  }
  
  // Creating new method 
  public static void printMatrix(int n){
    // Delcaring variable 
    int counter = 0;
    do { 
      for (int i = 0; i < n; i++){ 
        System.out.print((int)(Math.random() * 11)); // Generating random number
        System.out.print(" "); // Printing out spaces
      }
      System.out.println();
      counter++; // Increment counter 
    }while (counter < n);
    return; // return statement 
  }// end 1st method
  
  // Creating 2nd method 
  public static void printMatrixx(int j){
    // Declaring variable 
    int ccounter = 0;
    do {
      for (int l = 0; l < j ; l++){
        System.out.print((int)(Math.random() * 11)); // Generating random number from 0 - 10
        System.out.print(" "); // Printing out spaces
      } 
      System.out.println();
      ccounter++; // Increment counter 
    }while (ccounter < j);
    return; // return statement 
  } // end 2nd method 
  

  
  
} // end main method 