/*
  Thomas Mak 
  CoSci290
  02/20/2018
  Using if and else and else if statements to help generate your text adventure
*/

import java.util.Random;
public class TestScenario{
 
  // Start of application
  public static void main(String[] args){
  
    
      System.out.println("There are 5 doors in this room, please choose the right one to process.");

    // Declaring variables
    /*  
    int num1 = 1;
      int num2 = 100;
      System.out.println(Math.random());
      int randomNum = (num1 + (int)Math.random() + num2);
*/
  int randomNum = (int)((Math.random() * 5) + 1);
    System.out.println((int)((Math.random() * 5) + 1));


  
      if(randomNum == 5){
        System.out.println("You have choosen the right door. Please move ahead.");
      }
      else if(randomNum == 4){
        System.out.println("Are you sure you want this door? This might lead to your death.");
      }
      else if(randomNum == 3){
        System.out.println("You found a key for another room.");
      }
      else if(randomNum == 2){
        System.out.println("You found a chest full of loot.");
      }
      else{
        System.out.println("Please try again.");
      }
  }
}