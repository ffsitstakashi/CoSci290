/*
  Thomas Mak 
  04/24/2018
  Co Sci 290
  Lab 15 - Chapter 5, Problem 13
*/

public class Lab15{

  public static void main(String[] args){
  
    // Declaring variables
    int n = 0;
    
    while (Math.pow(n, 3) <= 12000) {
      n++; // Increment 
    }
      n--; // Decrement
    
    // Display result
    System.out.println("The n is " + n);
    System.out.println("The n^3 is " + Math.pow(n, 3));
  
  }
 
}