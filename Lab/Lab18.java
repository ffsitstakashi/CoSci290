/* 
  Thomas Mak (worked with Ben Luck)
  Co Sci 290
  05/03/2018
  Lab 18 - Find the smallest element
*/

import java.util.Scanner;

public class Lab18{

  public static void main(String[] args){
    
    // Create Scanner
    Scanner input = new Scanner(System.in);
    
    // Creating the array 
    double[] num = new double[10];
    
    // Prompt user to enter num
    System.out.println("Enter ten numbers: ");
    
    for (int i = 0; i < num.length; i++) {
      num[i] = input.nextDouble();
    }
      // Display the results
      System.out.println("The minimum number is: " + min(num));
    }
  
  // New method 
  public static double min(double[] array) {
    
    double min = array[0];
    for (double num = array) {
      if (num < min)
        min = num;
    }
    return min;
    }
}