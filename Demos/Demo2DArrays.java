/*
  Thomas Mak
  05/15/2018
  Co Sci 290
  Purpose: Test 2D arrays
*/

public class Demo2DArrays{

  public static void main(String[] args){
    
    // Declare 2D arrays
    String[][] words = new String[3][2];
    /*
      {
        {null . null},
        {null , null},
        {null , null}
      }
    */
    
    // Assign first element in 2D array
    words[0][0] = "cat";
    
    // Get element in 2D array
    System.out.println(words[0][0]);
    System.out.println(words[0][1]);
    
    // Iterate through array and assign values using loops
    for(int i = 0; i < words.length; i++){ // Goes through each row
      for (int j = 0; j < words[i].length; j++){ // Goes through each column
        words[i][j] = i * j + " cats"; // Assign
        System.out.println(words[i][j]); // Print
      }
    }
    
    // Use custom function
    System.out.println(print2DArray(words));
    
  } // end of main
  
  // This method concatentates all elements in a 2D array
  public static String print2DArray(String[][] array){
    
    // Holder for concatenated string
    String concat = "";
    
    // Go through each element in 2D array
    for(int i = 0; i < array.length; i++){ // Row
      for (int j = 0; j < array[i].length; j++){
        concat = concat + array[i][j] + " "; // Concatentes each String element
      }
    }
    return concat;
  }
  
} // end of class