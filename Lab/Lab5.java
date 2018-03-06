/*
  Thomas Mak
  CoSci290
  02/27/2018
  Lab 5 - fix the logic and make this code check if each character is a letter
*/

import java.util.Scanner;
public class Lab5{

  // main method
  public static void main(String[] args){
    // Creating Scanner
    Scanner input = new Scanner(System.in);
    // Declaring variable
    String name = "";
    int nameLength = 0;
    // Printing out question
    System.out.println("What is your name?");
    // Creating a while-loop to check if it has at least two characters
    while (nameLength < 2){
      // Prompt user to enter name
      name = input.next();
      if (name.length() < 2){
        System.out.println("Please enter in a name that is at least "
                          + "two letters long and no numbers.");
      }
      else{
        break; // breaking the while loop
      }
      } // end of while loop
    // Creating a for-loop to check for every single character if there are letters
    for (int i = 0; i < name.length(); i++) {
      if(Character.isLetter(name.charAt(i))){
        System.out.println(name.charAt(i));
      }
      else {
        System.out.println("Please enter in a name that is at least "
                           + "two letters long and no numbers.");
      }
    }
   }//end of main method
} //end of class