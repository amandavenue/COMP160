import java.util.Scanner;

/** StringBreakdown.java
  * Amanda Veldman August 2016
  * takes a user input of a string and counts the number of vowels and consonants in it
  */

public class StringBreakdown{
  
  public static void main(String[] args){
    
    int vow = 0, con = 0, index = 0;    // declare data fields
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentance: ");
    String userSent = scan.nextLine();
    String lower = userSent.toLowerCase();  // set lower case so that capital letters can be counted easily
    
    while (index < lower.length()){
      char ch = lower.charAt(index);
      if (ch >= 'a' && ch <= 'z'){     // ch only a letter
        switch (ch){
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':      // vowel cases add one to the vowel count
            vow++;
            break;
          default:
            con++;      // default case adds one to consonant count
        }
      } 
      index++;
    }
    System.out.println("Sentance is: " + userSent);
    System.out.println("Vowel count: " + vow);
    System.out.println("Consonant count: " + con);
  }
}