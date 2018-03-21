/*
  Thomas Mak
  03/20/2018
  Co Sci 290
  Lab 10 - Find numbers divisible by 5 and 6
*/

public class Part2Lab10{

  public static void main(String[] args){
    
    // Display title
    System.out.println("Divisible by 5 & 6");
    
    // Declaring variables
    final int numberPerLine = 10; // Display 10 number per line
    int count = 0;
    
      // Test for all the numbers between 100 to 1000
      for (int i = 100; i < 1000; i++){
        // Test if it is divisible by 5 and 6
        if (i % 5 == 0 && i % 6 == 0){
          // increment count 
          count++;
          // Test if line has 10 number
          if (count % numberPerLine == 0) 
            System.out.println(i);
	        else
            System.out.print(i + " ");	 
        }
      }
  }
}