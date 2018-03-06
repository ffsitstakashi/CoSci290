/* 
  Thomas Mak
  CoSci 290 
  02/22/2018

  Topics: 
    Functions/methonds - what all the different parts are 
    - access modifier 
    - return type 
    - function name 
    - parameters (optional)
*/

public class TestFunctions{

  //entry point of application
  public static void main(String[] args){
  
  /*
    access modifiers
    public - anything can see/access
    private - only fucntions within a class can access 
    defalut - same thing as no written/declared modifer 
  
    return types 
    - nt 
    - double
    - String 
    - char
    - boolean 
    - void - doesn't return anything 
    - also return different object types 
  
    Funtion names 
    - follows the same rules as any identifier 
    - use the name of thee == function to call it 
  
    Function parameters
    - input that the fucntion uses inside somewhere 
    - seperate multiple parameters with comma 
  */
    
    // testing custom functiom called findSum()
    System.out.println("The sum of 2 and 3 is: " + findSum(2, 3)); 
    
    // test printHello()
    printHello("Thomas");
  
 }
  //this funstion finds the sum of two numbers 
  public static int findSum(int num1, int num2){
    int sum = num1 + num2; 
    return sum; 
  }
  public static void printHello(String name){
    System.out.println("Hello " + name);
  }
}
