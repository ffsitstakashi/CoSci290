/*
  Thomas Mak
  Co Sci 290
  03/06/2018
  Lab 6
*/



import java.util.Scanner;

public class Lab6 {

  public static void main(String[] args) {
  
    // Number of questions
    final int NUMBER_OF_QUESTIONS = 10;
    // Count the number of correct answers
    int correctCount = 0;
    // Count the number of questions
    int count = 0;
    long startTime = System.currentTimeMillis();
    // Out string is initially empty
    String output = " "; 
    Scanner input = new Scanner(System.in);
    
    while (count < NUMBER_OF_QUESTIONS) {
      // 1. Generate two random single-digit integers
      int number1 = (int)(Math.random() * 15 + 1);
      int number2 = (int)(Math.random() * 15 + 1);
      
      // 2. If number1 < number2, swap number1 with number2
      if (number1 < number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp; 
      }
      
      // 3. Prompt the student to answer "What is number1 - number2?"
      System.out.print("What is " + number1 + " + " + number2 + "? ");
      int answer = input.nextInt();
      
      // 4. Grade the answer and display the result
      if (number1 + number2 == answer) {
        System.out.println("You are correct!");
        // Ubcrease the correct answer count
        correctCount++;
      }
      else
        System.out.println("Your answer is wrong.\n" + number1 + " + " + number2 + " should be "
                          + (number1 - number2));
      
      // Increase the question count
      count++;
      
      output += "\n" + number1 + " + " + number2 + " = " + answer + 
        ((number1 + number2 == answer) ? " correct" : " wrong");
    }
    
    long endTime = System.currentTimeMillis();
    long testTime = endTime - startTime;
    
     System.out.println("Correct count is " + correctCount + 
                        "\nTest time is " + testTime / 1000 + " seconds\n" + output); 

  }
  
}