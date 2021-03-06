import java.util.Scanner;

/** EvenIntergers.java
  * Amanda Veldman August 2016
  * prints all even numbers between 2 and a user entered value
  */

public class EvenIntergers{
  
  public static void main(String[] args){
    
    int sum = 0, count = 2;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an interger larger than 1: ");
    int userInt = scan.nextInt();
    if (userInt < 2){
      System.out.println("Input value must not be less than 2");
    }
    
    /* while loop to add all even values up to the user int */
    while (count <= userInt){
      if (count % 2 == 0){
        sum += count;
        count ++;
      } else {
        count ++;
      }
      System.out.println("Sum of even numbers between 2 and " + userInt + " inclusive is: " + sum);
    }
    
  }
}