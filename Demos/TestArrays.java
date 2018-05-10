/* 
  Thomas Mak
  Co Sci 290
  05/03/2018
  Test Arrays
*/

public class TestArrays{

  public static void main(String[] args){
  
    // Declaring an array
    String[] names = new String[5];
    
    // Assign values to this array
    names[0] = "Steven";
    names[1] = "Chris";
    names[2] = "Hai";
    names[3] = "Gerson";
    names[4] = "Adam";
    
    // Update (Just re-assign it to another value)
    names[4] = "Lynn";
    
    for (int i = 0; i < names.length; i++){
      System.out.println("Element " + i + ": " + names[1]);
    }
    
  } // end of main 
  
} // end of class