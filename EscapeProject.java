/* 
  Thomas Mak
  CoSci 290
  Escape The Room Project
*/

import java.util.Scanner;
public class EscapeProject{

  // main method, where the program starts
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Greetings! You have just woken up!");
    // Declaring variables
    String name = ""; 
    String location = "";
    String thought = "";
    int door = 0;
    
    System.out.println("Please enter your first name" + name);
    name = input.next();
    System.out.println("Welcome " + name + "!");
    
    System.out.println(name + ",do you remember anything that happened?");
    thought = input.next();
    
    System.out.println(name + ", do you know this place?");
    location = input.next();
    
    System.out.println(name + ", there are three doors. One of those doors will lead you the right way, one will lead you to death, and one will do nothing");
    System.out.println("Choose the right number: 1, 2, or 3");
    door = input.nextInt();
    System.out.println(door + " wrong door");
  }
}