/* 
  Thomas Mak
  CoSci290
  03/01/2018
  Use control structures to do string manipulation 
    and user validation
    
  Built-in String functions
    str.length() 
    str.toLowerCase() - makes all letters lowercase
    str.toUpperCase() - makes all letters uppercase
    str.equals("some other string") - checks if two Strings are exactly the same
    str.equalsIgnoreCase("no") - checks if two Strings are equal regardless of case
    str.charAt(int index) - get a specific character at index
    str.substring(int startIndex, int ending Index) - gives a subset string based on given range
*/

public class Logic1{
  
  public static void main(String[] args){
    
    // declaring variables
    String str = "Java Rules!"; // length = 1
    int num = 10;
    
    // use loop to iterate through str
    for (int index = 0; index < str.length(); index++){
      // first iteration - index = 0 - "J" index updates to 1
      // second iteration - index = 1 - "a" index updates to 2
      if (index % 2 == 0){
        System.out.println(str.charAt(index));
      }
    } // end of loop
    
    System.out.println(str.substring(0,4)); //output - "Java"
  }
}