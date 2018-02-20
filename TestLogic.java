/* 
  Thomas Mak
  CoSci290
  02/20/2018
  Topics:
    - multi-way if-else
    - logical operators
    - symbolic logic
*/

import java.util.Scanner;
public class TestLogic{

  // Start of application
  public static void main(String[] args){
    
    // Create Scanner
    Scanner input = new Scanner(System.in);
    // Prompt the user to enter grade
    System.out.println("Enter in a grade: ");
    int grade = input.nextInt();
    
    /*
    // simply if
    if(grade >= 90){
      System.out.println("A");
    }
    
    // two-way if-else
    if(grade < 90){
      System.out.println("Grade is not an A");
    } 
    else{
      System.out.println("Grade is an A");
    }
  
    
    // multi if - else if - else
    if(grade >= 90){
      System.out.println("A");
    }
    else if (grade >= 80){
      System.out.println("B");
    }
    else if (grade >= 70){
      System.out.println("C");
    }
    else{
      System.out.println("F");
    }
   
   
      Logical operators
      ! - NOT
      != - NOT equal to
      == - in equal to?
      && - AND
      || - OR
      
      Symbolic Logic w/ Java Logical Operators
        p | q | !p | !q | p && q | p || q | !(p || q) | !p || !q | !p ||(p && Q) | !q && [!p || (p && q)]
        T | T |  F |  F |    T   |    T   |     F     |    F     |       T       |        F
        F | F |  T |  T |    F   |    F   |     T     |    T     |       T       |        T 
        T | F |  F |  T |    F   |    T   |     F     |    T     |       F       |        F
        F | T |  T |  F |    T   |    T   |     F     |    T     |       T       |        F
      
      
      && - AND --> if both are true, the conditional evalutates to true
      P = true            P && Q
      Q = true             true
      Q1 = false          P && Q1
      P1 = false           false
      
      || - OR --> if either is true, the conditional evalutes to true
        P || Q 
         true
        P || Q1
         true 
        P1 || Q1
         false
    */
    
    // using if-else, write code that checks whether a student grade is good, average, or bad
    if(grade >= 80){
      System.out.println("This is a good grade");
    }
    else if(grade < 80 && grade >= 70){
      System.out.println("This grade is average");
    }
    else{
      System.out.println("This is a bad grade");
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}