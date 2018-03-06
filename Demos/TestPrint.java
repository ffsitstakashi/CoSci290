// Thomas Mak
// CoSci290
// Testing different print examples

/*
  This application is a demo to test different 
  printout statement
*/

public class TestPrint{
  
  // main method, where the application starts
  public static void main(String[] args){
    System.out.println("cat");
    System.out.println(2 + 2);
    System.out.println("cat" + 2);
    System.out.println("cat" + 2 + 'c');
    System.out.println(2 + 'c' + "cat");
    System.out.print("'S\n");
    System.out.println("Hello \t World!");
    
    
    
    System.out.println("    ___________                                 ._.   \n " 
                      +  "   \\_   _____/ ______ ____ _____  ______   ____| |   \n " 
                      +  "    |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\ |   \n " 
                      +  "    |        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/\\|   \n " 
                      +  "   /_______  /____  >\\___  >____  /   __/ \\___  >_   \n " 
                      +  "           \\/     \\/     \\/     \\/|__|        \\/\\/ ");
  }
  
}