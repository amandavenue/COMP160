 /**
 * Fish.java
 * Lab 3, COMP160, 2016
 * Amanda Veldman July 2016
 */


import java.util.Scanner;// import scanner 

public class Fish{
 
  public static void main(String [] args){
    String verse3 = "This one has a little star."; // declare variable verse3
    String verse4;
    Scanner scan = new Scanner (System.in);
    System.out.println ("Enter verse 4 text: ");
    verse4 = scan.nextLine(); // declare varibale verse4 to scanner input
    
    printVerse1(); 
    printVerse2();
    printVerse(verse3);
    printVerse(verse4);
  }//end main
  
  /** declares a String variable called verse1 and displays it on the screen*/
  public static void printVerse1(){
    String verse1 = "One fish\nTwo fish\nRed fish\nBlue fish.\n";
    System.out.println(verse1);
  }//end printVerse1
  
  /** Declares string two (verse2) and prints it out*/
  public static void printVerse2(){
    String verse2 = "Black fish\nBlue Fish\nOld fish\nNew Fish";
    System.out.println(verse2);
  }//end printVerse2
  
  /** Uses strings declared in the main method to print the last two lines of the poem */
  public static void printVerse(String verse){
    System.out.println("\n" + verse);
  }//end printVerse
    
  
}//end class
