/*
  Thomas Mak
  Co Sci 290
  03/01/2018
  
    Lab - write a program that taken user input in the format of "[number between 0-9] [item]"
    input: 2 guns
    
    output:
    You have 2 items
    Those items are guns
*/
import java.util.Scanner;

public class Group2Lab{

  public static void main(String[] args){
    
    // Creating Scanner
    Scanner input = new Scanner(System.in);
    
    // Declaring variables
    String str;
    
    // Prompt user to enter 2 guns
    System.out.println("Enter 2 guns");
    
    // String str = "2 guns";
    str = input.next();
    
    for (int index = 0; index < str.length(); index++){
      System.out.println(str.charAt(index));
    } 
      
    // Display results
    System.out.println("You have " + (str.substring(0 , 1)) + " items.");
    
    System.out.println("Those items are" + (str.substring(3 , 7)) + " guns.");
    //System.out.println(str.substring(0 , 6));
    
    
  }// end of method
}// end of application