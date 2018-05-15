/* 
  Thomas Mak w/ Ben Luck
  05/15/2018
  Co Sci 290
  Lab 20 - 2D Arrays
*/

public class Lab20{

  public static void main(String[] args){
    
    
    // Declaring 2D array
    int[][] number = new int[5][6];
    
    // Iterate through array and assign values using loops
      for(int i = 0; i < number.length; i++){
        for(int j = 0; j < number[i].length; j++){
          number[i][j] = 1 + (int)(Math.random() * 99) + 1;
          //System.out.println(number[i][j]);
        }
      }
    
    for(int row = 0; row < number.length; row++){
      for (int col = 0; col < number[row].length; col++){
        
      }
    }
    
    for(int row = 0; row < number.length; row++){
      for(int col = 0; col < number[row].length; col++){
        System.out.print(number[row][col] + " ");
      }
      System.out.print("\n");
    }
    
    
    /*
    // Randomly assigned numbers into each index
    for(int r = 0; r < number.length; r++){
      number[r] = (int)(Math.random() * 99) + 1;
    }
    */
  } // end of main
  
  
  
  //public static double sumEachRow(int[][] rowIndex) {
  
} // end of class