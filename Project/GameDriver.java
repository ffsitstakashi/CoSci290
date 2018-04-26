/*
  Thomas Mak
  CoSci 290
  HW 1: Demo of Project
*/

/*
HW1 Instruction
1. Create a class called "GameDriver" and save/name the file "GameDriver.java".
2. The program should start up with your text adventure splash screen (it would be a good idea
   to use the one from Lab 1).
3. Next, the program should have a print out of some story telling that starts
   the text adventure
4. Then, set up the game with questions asked from the user to start the text
   adventure (use same questions from Lab 2).
5. When the game is over, end the program with a "GAME OVER" message.

REMEMBER:
  Declare all your variables at the beginning of the program.  
*/

/* 
  git init
  git add .
  git commit -m "<insert some note about what you did>"
  git push origin master
  
  Do this command right before editing code every session:
  git pull origin master
*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class GameDriver{
  
  // Start of application
  public static void main(String[] args){
    // Create Scanner
    Scanner input = new Scanner(System.in);
    Utility tool = new Utility();
    
    // Display splash screen
    tool.readFile("SplashScreen.txt");
    // Story setup
    // Start of Game
    tool.readFile("Story.txt");
    System.out.println("");
    tool.readFile("Story2.txt");
    System.out.println("");
    tool.readFile("Story3.txt");
    
    // First Decision
    // Declaring variables and prompting user to choose an option
    System.out.println("1. Yes, crash the box! \n"
                       + "2. No, try searching the shelf");
    int puzzle;
    puzzle = input.nextInt();
    int puzzlee = puzzle;
    String puzzle1;
    switch(puzzlee){
      case 1: puzzle1 = "Yes, crash the box! You found the lost door handle";
        break;
      default: puzzle1 = "No, try searching the shelf! You only found some dust, it must be in the box";
        break;
      }
    System.out.print(puzzle1);
    System.out.println("");
    System.out.println("");
      
    String CONTENT = "testWriting";
    tool.writeFile("testWriting.txt", CONTENT);
    
    
    tool.readFile("Story4.txt");
    System.out.println("");
    
    System.out.println("Now choose 1 of theses 4 doors!");
      int choice = input.nextInt();
      if(choice == 4){
        System.out.println("You have choosen the right door. Please move ahead.");
      }
      else if (choice == 3){
        System.out.println("You have found a creepy doll, that might be useful later on.");
      }
      else if (choice == 2){
        System.out.println("You have found a chest full of clues.");
      }
      else if (choice == 1){
        System.out.println("You ran into a wall. Please try again!");
      }
    
    System.out.println("");
    
    System.out.println("There are 5 doors in this room, choose the right one to process!");
    
    
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
      System.out.println("Game Over.");
    }
    
    tool.readFile("GameOver.txt");
  }
}