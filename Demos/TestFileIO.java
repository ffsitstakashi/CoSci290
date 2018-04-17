/* 
  Thomas Mak
  04/17/2018
  Co Sci 290 
  Test File Input/Output
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileIO{

  public static void main(String[] args){
    
    String currentLine; // hold current line being read in file
    String filename = "Test.txt"; // hold the relative path of the file
    
    // trying to open a file to read
    try (BufferedReader br = new BufferedReader(new FileReader(filename))){
      
      // read each line in the file until the EOP
      while ((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
      // if there is no file to open, the exception will be caught
    } catch (IOException e){
      e.printStackTrace();
    }
  
  } // end main method 
  
} // end class