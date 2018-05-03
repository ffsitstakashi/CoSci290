import java.util.Scanner;

public class Testing{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    
    int age;
    boolean valid; 
    do{
      System.out.println(" what is your age?");
      age = input.nextInt();
      valid = age > 0 && age < 3;
      if (!valid){
        System.out.println("Error");
      }
    }while (!valid);
    
  }
  
}
