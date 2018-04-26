/* 
  Thomas Mak
  04/17/2018
  Co Sci 290
  
  This Utility class houses all the custom methods 
  that support my text adventure.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Utility{
  
  /*
    This method opens a file and prints out each line
  */
  public void readFile(String filename){
    String currentLine; // hold current line being read in file
        
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
  }
    
  
  public void writeFile(String FILENAME, String CONTENT){
    
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))){
      
      String content = CONTENT;
        
        bw.write(content);
        
        System.out.println(content);
      }catch (IOException e){
      
        e.printStackTrace();
      }
  
  } // end class
} // end method


