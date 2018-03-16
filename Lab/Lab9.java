/*
  Thomas Mak
  Co Sci 290
  03/15/2018
  Chapter 6, Exercise 6.3
*/

import java.util.Scanner;

public class Lab9{

  public static void main(String[] args){
  
            // Create Scanner
         Scanner input = new Scanner(System.in);
      
         // Prompts the user to enter an integer and 
         // reports whether the integer is a palindrome
         System.out.print("Enter an integer: ");
         int number = input.nextInt();     
         
         // Determine whether or not it's a Palindrome 
         if (isPalindrome(number))
            {
               System.out.print(number + " is a Palindrome" );
            }
         else 
            {
               System.out.print(number + " is not a Palindrome" );
            }
      }
         // Method isPalindrome return true if number is a palindrome
         public static boolean isPalindrome(int number)
            {
               boolean palindrome;
               palindrome = number == reverse(number);
               return palindrome;
            }
         public static int reverse(int number)
            {
            int temp = 0, reverse =0;
            while (number > 10)
               {
                  temp = number % 10;
                  reverse += temp;
                  reverse *= 10;
                  number /= 10;
               }
               reverse += number;
               return reverse;
            }
}
