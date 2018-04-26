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
    System.out.println("1. Talk to the other person \n"
                       + "2. Keep Calm");
    
    // First Decision
    // Declaring variables and prompting user to choose an option
    int puzzle;
    puzzle = input.nextInt();
    int puzzlee = puzzle;
    String puzzle1;
    switch(puzzlee){
      case 1: puzzle1 = "Talk to the other person";
        break;
      default: puzzle1 = "Keep Calm";
        break;
      }
    System.out.print(puzzle1);
    System.out.println("");
    System.out.println("");
    
    // Second Decision
    tool.readFile("Story2.txt");
    System.out.println("");
    System.out.println("1. Go Right \n"
                      + "2. Go Left");
    
      
    int userInput = input.nextInt();
    if (userInput == 1){
      System.out.println("Go Right");
      System.out.println("");
      tool.readFile("Story3.txt");
    }
    
    if (userInput == 2){
      System.out.println("Go Left");
      System.out.println("");
      tool.readFile("Story3.5.txt");
    }
    
    
    
    /*
    
    // Declaring variables
    String question1 = "", question2 = "", question3 = "", question4 = "";
    
    System.out.println("What is your name?");
    question1 = input.next();
    
    System.out.println(question1 + ". Do you have any idea why you are here today?");
    question2 = input.next();
    /*
    // Questuon #1
    System.out.println("Do you remember anything that happened to you? "
                       + "Push 1 for Yes, Push 2 for No."); // Yes or No answers only
    // Prompt user to enter 1 or 2
    question = input.nextInt();
    if(question >= 2){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }     
    // Question #2 
    System.out.println("What about your name?"); 
    name = input.nextInt();
    if (name >= 2){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
    // Question #3
    System.out.println("Do you have an idea why you are here?");
    idea = input.nextInt();
    if (name >= 2){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
    */
    
    System.out.println("");
    System.out.println("Well, let's begin by trying to figure out a way to exit this room.");
    
    // Let the game begin!
    System.out.println("There are 5 doors in this room, choose the right one to process!");
    
    // Generate number between 1 to 5
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
    
    // Game Over
    tool.readFile("GameOver.txt");
  }
}