/*
  Thomas Mak
  03/08/2018
  Co Sci 290
  Lab 7
*/

import java.util.Scanner;

public class Lab7{

  public static void main(String[] args){
    
    // Create Scanner
    Scanner input = new Scanner(System.in);
    
    // Declaring variables
    double average = 0, total = 0;
    int negative = 0, positive = 0, numbers = 0, sum = 0;
    
    // Prompt user to enter input
    System.out.println("Enter an integer, the input ends if it is 0: ");
    numbers = input.nextInt();
    
    // Testing whether or not the user as a 0, if so it ends
    do {
      if (numbers > 0) {
          positive++; // add 1 to positive count
      } else if (numbers < 0) {
          negative++; // add 1 to negative count
      } // end else if

      sum += numbers; // add integer input to sum

      numbers = input.nextInt();
          total++;
      } while (numbers != 0);
    
    // Calcualte the average
    average = sum / total;
    
    // Display the sum of the numbers and display counter+/- numbers
    System.out.println("The amount of positves is " + positive);
    System.out.println("The amount of negatives is " + negative);
    System.out.println("The total is " + sum);
    System.out.println("The average is " + average);
   
    /*
    for (int i = 0; i < str.length(); i++){
      System.out.println(str.charAt(i));  
    
    if (!Character.isDigit(str.charAt(i))){
      System.out.println("This is not a digit! " + str.charAt(i));
    break;
    }
    }
    
    if (character.isLetter()){
      System.out.println("");
    }
    else (character.isDigit()){
      System.out.println("");
    }
    
    */
 
  }
  
}