/* 
  Thomas Mak
  04/19/2018
  Co Sci 290
  Test Writing File
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriteFile{

  public static void main(String[] args){
  
    String FILENAME;
    
      try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))){
        
        String content;
        
        bw.write(content);
        
        System.out.println(content);
      }catch (IOException e){
      
        e.printStackTrace();
      }
      
  }
}