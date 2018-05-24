/*
  Author: Thomas Mak worked w/ Benjamin Luck
  Date: 05/22/2018
  Subject: Co Sci 290
  
  Lab 22: Complete implementation for each function 
    to complete this Connect 4 game!
  
*/

import java.util.*;

public class Connect4{
  
  //declare 2d array to hold X's and O's to represent board
  static char[][] board = {
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                          };
  static char xo = 'x'; //holds which player is currently playing
  static boolean gameOver = false; //ends the loop if there is a winner
    
  //start of program
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int row = 0;
    int col = 0;
    System.out.println("Let's play Tic Tac Toe!");
       
    //while there isn't a winner
    while(!gameOver){
      printBoard();
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2 for row");
      row = input.nextInt();
      System.out.println("Please enter 0, 1, 2 for col");
      col = input.nextInt();
      move(row, col);
      if(checkWinner()){
        gameOver = true;
      }
    }
    
  }//end of main method

	/** print displays the board */
	public static void printBoard() {
    System.out.println(" " + board[0][0] + " | " + board[0][1] + " | "  + board[0][2] + " | " + board[0][3] + " | " + board[0][4] + " | " + board[0][5]);
    System.out.println("------------------------");
    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | "  + board[1][2] + " | " + board[1][3] + " | " + board[1][4] + " | " + board[1][5]);
    System.out.println("------------------------");
    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | "  + board[2][2] + " | " + board[2][3] + " | " + board[2][4] + " | " + board[2][5]);
    System.out.println("------------------------");
    System.out.println(" " + board[3][0] + " | " + board[3][1] + " | "  + board[3][2] + " | " + board[3][3] + " | " + board[3][4] + " | " + board[3][5]);
    System.out.println("------------------------");
    System.out.println(" " + board[4][0] + " | " + board[4][1] + " | "  + board[4][2] + " | " + board[4][3] + " | " + board[4][4] + " | " + board[4][5]);
    System.out.println("------------------------");
    System.out.println(" " + board[5][0] + " | " + board[5][1] + " | "  + board[5][2] + " | " + board[5][3] + " | " + board[5][4] + " | " + board[5][5]);
	}
  
  public static void changeXO(){    
    if (xo == 'o'){
      xo = 'x';
    }
    else{
      xo = 'o';
    }
  }//end of changeXO
  
  /*
    If there isn't already an x or o in that row and col
    place the character in the array.
    Then change xo.
    Else prompt the user to try again because there's already an x or o here.
  */
  
  public static void move(int row, int col){
    if (board[row][col] == ' ' ){
      board[row][col] = xo;
      changeXO();
      }
    else {
          System.out.println("Try Again");
        }
  } // end of move
  
  /*
    Returns true if there there is a winner or a draw to end the game
  */
  
  public static boolean checkWinner(){
    if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] == board[0][3] && board[0][0] != ' ' || // Row 0, Column 0 - 3
        board[0][1] == board[0][2] && board[0][1] == board[0][3] && board[0][1] == board[0][4] && board[0][1] != ' ' || // Row 0, Column 1 - 4
        board[0][2] == board[0][3] && board[0][2] == board[0][4] && board[0][2] == board[0][5] && board[0][2] != ' ' || // Row 0, Column 2 - 5
        
        board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] == board[1][3] && board[1][0] != ' ' || // Row 1, Column 0 - 3
        board[1][1] == board[1][2] && board[1][1] == board[1][3] && board[1][1] == board[1][4] && board[1][1] != ' ' || // Row 1, Column 1 - 4
        board[1][2] == board[1][3] && board[1][2] == board[1][4] && board[1][2] == board[1][5] && board[1][2] != ' ' || // Row 1, Column 2 - 5
        
        board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] == board[2][3] && board[2][0] != ' ' || // Row 2
        board[2][1] == board[2][2] && board[2][1] == board[2][3] && board[2][1] == board[2][4] && board[2][1] != ' ' ||
        board[2][2] == board[2][3] && board[2][2] == board[2][4] && board[2][2] == board[2][5] && board[2][2] != ' ' ||
        
        board[3][0] == board[3][1] && board[3][0] == board[3][2] && board[3][0] == board[3][3] && board[3][0] != ' ' || // Row 3
        board[3][1] == board[3][2] && board[3][1] == board[3][3] && board[3][1] == board[3][4] && board[3][1] != ' ' ||
        board[3][2] == board[3][3] && board[3][2] == board[3][4] && board[3][2] == board[3][5] && board[3][2] != ' ' ||
        
        board[4][0] == board[4][1] && board[4][0] == board[4][2] && board[4][0] == board[4][3] && board[4][0] != ' ' || // Row 4
        board[4][1] == board[4][2] && board[4][1] == board[4][3] && board[4][1] == board[4][4] && board[4][1] != ' ' ||
        board[4][2] == board[4][3] && board[4][2] == board[4][4] && board[4][2] == board[4][5] && board[4][2] != ' ' ||
        
        board[5][0] == board[5][1] && board[5][0] == board[5][2] && board[5][0] == board[5][3] && board[5][0] != ' ' || // Row 5
        board[5][1] == board[5][2] && board[5][1] == board[5][3] && board[5][1] == board[5][4] && board[5][1] != ' ' ||
        board[5][2] == board[5][3] && board[5][2] == board[5][4] && board[5][2] == board[5][5] && board[5][2] != ' ' ||
        
        board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] == board[3][0] && board[0][0] != ' ' || // Column 0
        board[1][0] == board[2][0] && board[1][0] == board[3][0] && board[1][0] == board[4][0] && board[1][0] != ' ' ||
        board[2][0] == board[3][0] && board[2][0] == board[4][0] && board[2][0] == board[5][0] && board[2][0] != ' ' ||
        
        board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] == board[3][1] && board[0][1] != ' ' || // Column 1
        board[1][1] == board[2][1] && board[1][1] == board[3][1] && board[1][1] == board[4][1] && board[1][1] != ' ' || 
        board[2][1] == board[3][1] && board[2][1] == board[4][1] && board[2][1] == board[5][1] && board[2][1] != ' ' || 
        
        board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] == board[3][2] && board[0][2] != ' ' || // Column 2
        board[1][2] == board[2][2] && board[1][2] == board[3][2] && board[1][2] == board[4][2] && board[1][2] != ' ' || 
        board[2][2] == board[3][2] && board[2][2] == board[4][2] && board[2][2] == board[5][2] && board[2][2] != ' ' ||
        
        board[0][3] == board[1][3] && board[0][3] == board[2][3] && board[0][3] == board[3][3] && board[0][3] != ' ' || // Column 3
        board[1][3] == board[2][3] && board[1][3] == board[3][3] && board[1][3] == board[4][3] && board[1][3] != ' ' || 
        board[2][3] == board[3][3] && board[2][3] == board[4][3] && board[2][3] == board[5][3] && board[2][3] != ' ' ||
        
        board[0][4] == board[1][4] && board[0][4] == board[2][4] && board[0][4] == board[3][4] && board[0][4] != ' ' || // Column 4
        board[1][4] == board[2][4] && board[1][4] == board[3][4] && board[1][4] == board[4][4] && board[1][4] != ' ' || 
        board[2][4] == board[3][4] && board[2][4] == board[4][4] && board[2][4] == board[5][4] && board[2][4] != ' ' ||
        
        board[0][5] == board[1][5] && board[0][5] == board[2][5] && board[0][5] == board[3][5] && board[0][5] != ' ' || // Column 5
        board[1][5] == board[2][5] && board[1][5] == board[3][5] && board[1][5] == board[4][5] && board[1][5] != ' ' || 
        board[2][5] == board[3][5] && board[2][5] == board[4][5] && board[2][5] == board[5][5] && board[2][5] != ' ' ||
           
        board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == board[3][3] && board[0][0] != ' ' ||
        board[1][1] == board[2][2] && board[1][1] == board[3][3] && board[1][1] == board[4][4] && board[1][1] != ' ' ||
        board[2][2] == board[3][3] && board[2][2] == board[4][4] && board[2][2] == board[5][5] && board[2][2] != ' ' ||  
        board[1][0] == board[2][1] && board[1][0] == board[3][2] && board[1][0] == board[4][3] && board[1][0] != ' ' ||
        board[2][1] == board[3][2] && board[2][1] == board[4][3] && board[2][1] == board[5][4] && board[2][1] != ' ' ||
        board[2][0] == board[3][1] && board[2][0] == board[4][2] && board[2][0] == board[5][3] && board[2][0] != ' ' ||
        board[0][1] == board[1][2] && board[0][1] == board[2][3] && board[0][1] == board[3][4] && board[0][1] != ' ' ||
        board[1][2] == board[2][3] && board[1][2] == board[3][4] && board[1][2] == board[4][5] && board[1][2] != ' ' ||
        board[0][2] == board[1][3] && board[0][2] == board[2][4] && board[0][2] == board[3][5] && board[0][2] != ' ' ||
        
        board[5][0] == board[4][1] && board[5][0] == board[3][2] && board[5][0] == board[2][3] && board[5][0] != ' ' ||
        board[4][1] == board[3][2] && board[4][1] == board[2][3] && board[4][1] == board[1][4] && board[4][1] != ' ' ||
        board[3][2] == board[2][3] && board[3][2] == board[1][4] && board[3][2] == board[0][5] && board[3][2] != ' ' ||
        
        board[4][0] == board[3][1] && board[4][0] == board[2][2] && board[4][0] == board[1][3] && board[4][0] != ' ' ||
        board[3][1] == board[2][2] && board[3][1] == board[1][3] && board[3][1] == board[0][4] && board[3][1] != ' ' ||
        board[3][0] == board[2][1] && board[3][0] == board[1][2] && board[3][0] == board[0][3] && board[3][0] != ' ' ||
        
        board[5][1] == board[4][2] && board[5][1] == board[3][3] && board[5][1] == board[2][4] && board[5][1] != ' ' ||
        board[4][2] == board[3][3] && board[4][2] == board[2][4] && board[4][2] == board[1][5] && board[4][2] != ' ' ||
        board[5][2] == board[4][3] && board[5][2] == board[3][4] && board[5][2] == board[2][5] && board[5][2] != ' ' ){     
      
      printBoard(); // Call back board
      changeXO(); // Call back change of X and O
      System.out.println("Player " + xo + " is the winner!");
        return true;
      }
    else{
      return false;
    }
  } // end of checkWinner
}//end class