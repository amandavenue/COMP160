import java.util.Scanner;
/** Anagram.java
  * Amanda Veldman August 2016
  * Works out whether or not one word is an anagram of another (both user entered)
  */

public class Anagram{
  
  public static String letters = "";                     // make string for the letters to be added to in alphabetical order
  
  /* rearranges letters in phrase into alphabetical order
   * @returns letters */
  public static String alphaLetters(String x){
    letters = "";
    for(char a='a'; a <= 'z'; a++){
      for (int i = 0; i < x.length(); i++){
        if (x.charAt(i) == a){
          letters += a;
        }
      }
    }
   return letters;
  }
  
  public static void main (String [] args){
    
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter first phrase: ");
    String ph1 = scan1.nextLine();               // scan in first phrase
    
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Enter second phrase: ");
    String ph2 = scan2.nextLine();               // scan in second phrase
    
    String ph1low = ph1.toLowerCase();
    String ph2low = ph2.toLowerCase();           // set both to lower case
    
    String letter1 = alphaLetters(ph1low);
    String letter2 = alphaLetters(ph2low);
    
    System.out.println(letter1 + " are the letters in phrase 1");
    System.out.println(letter2 + " are the letters in phrase 2");
    if (letter1.equals(letter2)){
      System.out.println(ph1 + " is an anagram of " + ph2);
    } else {
      System.out.println(ph1 + " is not an anagram of " + ph2);
    }
  }
}
