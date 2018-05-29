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
    
    // Room 1
    int num;
    boolean valid;
    do{
      System.out.println("1. Yes, crash the box! \n"
                        + "2. No, try searching the shelf");
      num = input.nextInt();
      valid = num > 0 && num < 2;
      if (!valid){
        System.out.println("You only found some dust, it must be in the box.");
        System.out.println("Do you want to brake the box?");
      }
    }while (!valid);  
    
    // Testing if this works or not
    System.out.println(" ");
    String CONTENT = "Speaker Talks";
    tool.writeFile("testWriting.txt", CONTENT);
    
    tool.readFile("Story4.txt");
    System.out.println("");
    
    // Room 2
    int choice;
    boolean valid2;
    do{
      System.out.println("1. Begin crafting a key for the door. \n"
                         + "2. Try opening the door without a key."); 
      choice = input.nextInt();
      valid2 = choice > 0 && choice < 2;
      if (!valid2){
        System.out.println("The door is locked. Go craft a key.");
        System.out.println("Do you want to craft a key?.");
      } 
    }while (!valid2);
    
    System.out.println(" ");
    CONTENT = "Speaker Talks";
    tool.writeFile("testWriting.txt", CONTENT);
    tool.readFile("Story5.txt");
    
    // Room 3
    int number;
    String numNum;
    System.out.println("1. Enter the room without a key. \n" 
                       + "2. Look through the box for a key.");
    number = input.nextInt();
    switch (number){
      case 1: numNum = "Enter the room without a key.";
        break;
      default: numNum = "Look through the box for a key.";
        break;
    }
    
    CONTENT = "Speaker Talks";
    tool.writeFile("testWriting.txt", CONTENT);
    tool.readFile("Story6.txt");
    
    System.out.println("Now choose 1 of theses 4 doors!");
    int choicee = input.nextInt();
      if(choicee == 4){
        System.out.println("You have choosen the right door. Please move ahead.");
      }
      else if (choicee == 3){
        System.out.println("You have found a stone statue and a key, that might be useful later on.");
      }
      else if (choicee == 2){
        System.out.println("You have found a chest full of nothingness.");
      }
      else if (choicee == 1){
        System.out.println("You ran into a wall. Please try again!");
      }
      
    System.out.println("")
    
    
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