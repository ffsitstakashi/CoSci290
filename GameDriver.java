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
public class GameDriver{
  
  // Start of application
  public static void main(String[] args){
    // Create Scanner
    Scanner input = new Scanner(System.in);
    
    // Display splash screen
    System.out.println("    ___________                                 ._.   \n " 
                      +  "   \\_   _____/ ______ ____ _____  ______   ____| |   \n " 
                      +  "    |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\ |   \n " 
                      +  "    |        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/\\|   \n " 
                      +  "   /_______  /____  >\\___  >____  /   __/ \\___  >_   \n " 
                      +  "           \\/     \\/     \\/     \\/|__|        \\/\\/ ");
    System.out.println("Ok class this is our last day together before spring break, Professor Vu said as we all cheered with happiness. \n"
                      + "Calm down calm down, just because you're going on a break doesn't mean you can't work. You all will have to do \n"
                      + "a report on what you did for break. As the bell began to rang, Adam grabbed his stuff and ran out as fast as \n"
                      + "possible to meet up with friends to talk about what the plan is for the break. As that time came for everyone to leave \n"
                      + "campus, Adam went home to get some rest. The next day, Adam and his friends all met up at Bill's house before heading out \n"
                      + "together. As friends began coming slowly, they started to move the stuff into the car to make the leaving phrase easier. \n"
                      + "Once all the friends came, they went to the destination, which was the beach for today. Everyone was waiting for this day to \n"
                      + "come since they all needed a break from school. Upon arriving to the beach, they set up boot camp and began there adventure \n"
                      + "at the beach. But little did Adam and his friends know, something went terribly wrong throughout the day. Adam was the only one who \n"
                      + "saw different clues and strange things happening, but his friends didn't notice anything. As the sun slowly moved down, they packed up and \n"
                      + "went home enjoying there first day of break. Once Adam parked the car on the driveway, he started to unpack the car, but he sense \n"
                      + "someone was behind him and turned around and got knocked out. As Adam closely open his eyes, he was shocked of where he was. As the \n"
                      + "operator saw Adam waking up.");
    // Start of Game Time
    System.out.println("");
    System.out.println("Mysteriously music started to play and the speaker begins to speak.");
    System.out.println("It has seem that you have finally woken up. You are totally safe and sound here, but we have a little game for you to enjoy first. \n"
                      + "Please enjoy your stand and find clues to escape the hotel. First of all, here are some questions I would like to ask you before \n"
                      + "you start.");
    
    // Declaring variables
    int question;
    int name;
    int idea;
                       
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
    System.out.println("Game Over.");
  }
}