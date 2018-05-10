/*
  Thomas Mak
  05/10/2018
  Co Sci 290
  Group 2 Quiz 2
  
Here's a goofy programming problem that was made for the purpose of testing how well you understand arrays, modulus, and control structures like if-else and loops:
Write a program that has two arrays with size of as many letters there are in your first name. Randomly assign integers to each index in each array. Be sure to make this random integer generator a separate custom function that is called within main method.
Go through each array and count how many odd numbers there are and then count how many even numbers there are. Be sure to create a custom function that returns whether a number is even or odd.
Create two new arrays, one called even and the other called odd, each of these arrays will have the array size of their respective counters from above.
Fill the odd array with the odd numbers and then fill the even array with even numbers. 
Then iterate through each array and output the values.

*/

import java.util.Random;

public class Group2Quiz2{

  public static void main(String[] args){
    
    // Declaring an array
    String[] names = new String[6];
    // Assign values to array
    names[0] = "T";
    names[1] = "H";
    names[2] = "O";
    names[3] = "M";
    names[4] = "A";
    names[5] = "S";
    
    // Print out first array
    for (int i = 0; i < names.length; i++){
      System.out.println(i + ": " + names[i]);
    }
    
    // Generating random number from 0 to 5
    int[] randomNumbers = new int[6];
    Random rand = new Random();
    
    for (int k = 0; k < randomNumbers.length; k++){
      int n = rand.nextInt(6);
      randomNumbers[k] = n;
    }
    
    for (int k = 0; k < randomNumbers.length; k++){
      System.out.println(randomNumbers[k]);
    }
    
    
    /*
    
    // Declaring new variables to consider if odd or even
    int odd = 0, even = 0;
    System.out.println("Odd \t Even");
    for (int k = 0; k < 6; k++){
      System.out.println(odd);
      System.out.println(even);
    }
    
    int[] odds = new int[odd];
    int[] evens = new int[evens];
    int o = 0;
    int e = 0;
    for (int k = 0; k < 6; k++){
      if (isOdd(names[i]))
        odds[o] = names[i];
      else 
        evens[e++] = names[i];
    }
    
    System.out.println(odds[o]);
    System.out.println(evens[e]);
    */
    
    
    
  } // end of main
  
} // end of class


