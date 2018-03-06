/* 
  Thomas Mak
  CoSci 290
  Testing datatypes and input from the user
*/

import java.util.Scanner; // is a Java object that allows you take over input
public class TestInput{

  // main method, starting point of application 
  public static void main(String[] args){
   // datatype variableName = expression 
    // 1. Identifiers can only start with a letter, _, or $
    // 2. Identifiers with multiple words are camelCased
    // e.g. - numOfStudents, name, interestRate
    
    // datatypes
    // int - integer - whole number => 3, 214748364, 102, -11
    // double - decimal number => 3.33, 0.2, 0.33333, -33.33
    // char - single character inside single quotations => '3', 'f', ' '
    // boolean - true or false => true, false
    
    // object/reference datatypes
    // String - characters surrounded with double quotations => "ldkfgj", "cat", "3"
    /* There are other objects in Java that comes with Java and that are custom 
      => Objects/class that comes with Java: Scanner, System, Math, etc.Objects
      => Customer classes: Zombie SpaceInvader, Person, etc.
    */
    
    final double PI_VALUE = 3.1415; // constants are all capital, multiples words seperated by underscores
    String name = "";
    int numberOfStudents = 29;
    double avgGPA = 3.78;
    boolean gameOver = false; // or true
    int age = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hi, give me your name: ");
    
    name = input.next(); // .next() is for String types
    
    System.out.println("Hi " + name);
    
    System.out.println("How old are you?");
    
    age = input.nextInt(); // .nextInt is for int types
    
    System.out.println("You are " + age + " years old!");
    
    /* 
      Arithmetic Operators
      + addition
      - subtraction
      * multiplication
      / divison
      = assigment operator, equals
      % modules, reminder. e.g. 10 % 2 ==> 10 / 2 and then finding remander, which is 0
      
      Programming math opertations follow the same order of operations
      (), exponemts, multiplication OR division, addition OR subtraction
      from left to right
    */
    
    int month = age * 12;
    int days = age * 365;
    int hours = days * 24;
    
    System.out.println("You are " + month + " months old OR " + days + " days old OR "
                       + hours + " hour old!");
    
  }
}