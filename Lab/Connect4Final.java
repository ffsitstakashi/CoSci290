/*
  Author: Thomas Mak 
  Date: 05/29/2018
  Subject: Co Sci 290
  
  Final: Add the functionality of gravity to your Connect 4 game
  
*/

import java.util.*;

public class Connect4Final{
  
  // Global variables
  final static int WIDTH = 6;
  final static int HEIGHT = 6;
  final static int BOTTOM_ROW = WIDTH - 1;
  // Game board
  static char[][] board = new char[WIDTH][HEIGHT];
  // Creates scanner
  static Scanner scanner = new Scanner(System.in);
  
  // Start of program
  public static void main(String[] args){
        // Creates board
        CreateBoard();
        // Prompt user to enter which column
        System.out.println("Use 0-5 to choose what column you want");
        // Displays board
        PrintBoard();
        boolean flag = true; // creates boolean to determine status of game
    
        // Main game loop
        while(flag){
          // Player X turn
          DropX();
          PrintBoard();
          if(!CheckX()){ // Determines if player X has won
            flag = false; 
            break; 
          }  
          // Player O turn
          DropO();
          PrintBoard();
          // Determines if player O has won
          if(!CheckO()){
            flag = false; 
            break; 
          }
        }
    } // end of main
  
  public static void CreateBoard() {
    // Fills board with '.' for the width and height
    for (int w = 0; WIDTH > w; w += 1) {
      for (int h = 0; HEIGHT > h; h += 1) {
        board[w][h] = '.';
      }
    }
  } // End of CreateBoard
  
  public static void PrintBoard() {
    //prints the board
    for (int w = 0; WIDTH > w; w += 1) {
      for (int h = 0; HEIGHT > h; h += 1) {
        System.out.print(board[w][h]);
      }
      System.out.println();
    }
    System.out.println();
  } // End of Print
  
  // Player X method
  public static void DropX(){
    // Create a counter
    int counter = 1;
    System.out.println("Player X turn");
    int column = scanner.nextInt();
    while(true){
      if(column > WIDTH){
        System.out.println("That's not a valid column");
        break;
      }
      if (board[BOTTOM_ROW][column] == '.') { // Cchecks to see if space is blank, puts X there if it is
        board[BOTTOM_ROW][column] = 'X';
        break; 
      }else if(board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O'){ // If space isn't blank, checks to see if one above is
        if(board[BOTTOM_ROW - counter][column] == '.'){ // Puts X if blank
          board[BOTTOM_ROW - counter][column] = 'X';
          break; 
        }
      }
      counter += 1; // Adds one to counter if the space wasn't blank, then loops again
      if(counter == WIDTH){ // Checks to see if at end of column
        System.out.println("That column is full");
        break;
      }
    }
  } // End of DropX
  
  // Player O method
  public static void DropO(){
    int counter = 1;
    System.out.println("Player O turn");
    int column = scanner.nextInt();
    while(true){
      if(column > WIDTH){
        System.out.println("That's not a valid column");
        break;
      }
      if (board[BOTTOM_ROW][column] == '.') { 
        board[BOTTOM_ROW][column] = 'O';
        break; 
      }else if(board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O'){ 
        if(board[BOTTOM_ROW - counter][column] == '.'){ 
          board[BOTTOM_ROW - counter][column] = 'O';
          break; 
        }
      }
      counter += 1; // Adds one to counter if the space wasn't blank, then loops again
      if(counter == WIDTH){ // Checks to see if at end of column
        System.out.println("That column is full");
        break;
      }
    }
  } // End of DropO
  
  
  public static boolean CheckXHorizontal(){
    boolean flag = true;
    int counter = 0;
    while(flag){
      
      for(int w = 0; WIDTH > w; w += 1){ // Goes through board horizontally
        for(int h = 0; HEIGHT > h; h += 1){
          if(board[w][h] == 'X'){ // If it finds an X, add 1 to counter
            counter += 1;
          }else{
            counter = 0; // If next piece is not an X, set counter to 0
          }
          if(counter >= 4){
            System.out.println("Player 1 wins"); // If counter is greater or equal to 4, player wins
            flag = false;
          }
        }
      }
      break;
    }
    return flag;
  } // End of CheckXHorizontal
  
  public static boolean CheckXVertical(){
    boolean flag = true;
    int counter = 0;
    while(flag){
       
      for(int h = 0; HEIGHT > h; h += 1){ // Goes through board vertically
        for(int w = 0; WIDTH > w; w += 1){
          if(board[w][h] == 'X'){ // If it finds an X, add 1 to counter
            counter += 1;
          }else{
            counter = 0; // If next piece is not an X, set counter to 0
          }
          if(counter >= 4){
            System.out.println("Player 1 wins"); // If counter is greater or equal to 4, player wins
            flag = false;
          }
        }
      }
      break;
    }
    return flag;
  } // End of CheckXVertical
  
  public static boolean CheckOHorizontal(){
    boolean flag = true;
    int counter = 0;
    while(flag){
      for(int w = 0; WIDTH > w; w += 1){
        for(int h = 0; HEIGHT > h; h += 1){
          if(board[w][h] == 'O'){ 
            counter += 1;
          }else{
            counter = 0; // 
          }
          if(counter >= 4){
            System.out.println("Player 2 wins"); 
            flag = false;
          }
        }
      }
      break;
    }
    return flag;
  } // End of CheckOHorizontal
  
  public static boolean CheckOVertical(){
    boolean flag = true;
    int counter = 0;
    while(flag){
      for(int h = 0; HEIGHT > h; h += 1){
        for(int w = 0; WIDTH > w; w += 1){
          if(board[w][h] == 'O'){ 
            counter += 1;
          }else{
            counter = 0; 
          }
          if(counter >= 4){
            System.out.println("Player 2 wins");
            flag = false;
          }
        }
      }
      break;
    }
    return flag;
  } // End of CheckOVertical

  
  // Method that checks if X won
  public static boolean CheckX(){
    boolean flag = true;
    //checks all Xs at once, for clearner main loop
    if(!CheckXVertical() || !CheckXHorizontal()){
      flag = false;
    }
    return flag;
  } // End of CheckX
  
  // Method that checks if O won
  public static boolean CheckO(){ 
    boolean flag = true;
    if(!CheckOVertical() || !CheckOHorizontal()){
      flag = false;
    }
    return flag;
  } // End of CheckO;
} //end Class