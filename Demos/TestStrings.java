/*
  Thomas Mak 
  CoSci290
  02/27/2018
  Demo on the String class
*/

import java.util.Scanner;
public class TestStrings{
  
  // main method
  public static void main(String[] args){
    // Instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    // answer = answer.toLowerCase();
    /*
      Impose some rules on user input
      name.length(); // gives a int of how many characters the String is long
    */
    
    // Example of a while loop
    int nameLength = 0;
    String answer = "";
    boolean flag = false;
    
    /*
      Using Pseudocode write your logic
      while the user gives a name that is less than 2 characters{
        check if input is less than two characters{
          and keep prompting
        else{
          the input is > than 1 character 
          now check if each character is a letters 
          
          for each character in input{
            if each char is not a letter{
              get out of the loop
              }
            }
          }
        }
      }
        
    */
    
    while(nameLength < 2 && !flag){
      
      System.out.println("What is your name?");
      // Get answer from user
      answer = input.next();
      
      // Checking if name is less than 2 characters
      if(answer.length() < 2 ){
      System.out.println("Please enter in a name that is at least" 
                        + " two characters long");
      
    }
      // Checking if name is at least 2 characters
      else{
        // Check if name contains letters
        // For example, go through each letters in the name "Logan"
        // name.charAt(0) to look at the character in index 0
        // Use a for-loop because we know ho wmany letters it has
        for(int index = 0; index < answer.length(); index++){
          // Check if the character is a letters
          // if it's not a letter
          if(!Character.isLetterOrDigit(answer.charAt(index))){ 
            flag = true;
            break; // gets out of current loop
          }
        }
      }
    
      nameLength = answer.length();
    } // end of loop
    
    /*
    // Do-while loop example
      do{
        the body with code.
        ...
        
      }while(some condition)
    */
    
    /*
      Examples below is to test for specific respons
      
      answer.toLowerCase(); // makes all letters lowercase
      answer.toUpperCase(); // makes all letters uppercase
      answer.equals("some other string"); // checks if two Strings are exactly the same
      answer.equalsIgnoreCase("no"); // checks if two Strings are equals regardless of case
    */
    
    // Example of what the user to enter yes or no in any way
    // Ask the user a question
    System.out.println("Are you rich? Yes or No?");
    
    // check if answer is specifically Yes or No
    if(answer.equalsIgnoreCase("No")){ // "no" != "No"
      System.out.println("That sucks!");
    }
    else{
      System.out.println("Cool.");
    }
    
  }
  
}

