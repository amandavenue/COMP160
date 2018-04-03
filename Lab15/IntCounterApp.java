import java.util.Random;
import java.util.Scanner;
/** intcounterapp.java
  * Amanda Veldman September 2016
  * creates insances of intcounter and excecutes them 
  */

public class IntCounterApp{
  
  /** creates an array of ints between 0 and 4 of length 5-10 */
  public static int [] makeArray(){
    Random generator = new Random();
    int len = generator.nextInt(6) + 5;
    int [] array = new int[len];
    for(int i=0; i < array.length; i++){
      int num = generator.nextInt(5);
      array [i] = num;
    }
    return array;
  }
  
  public static void main(String [] args){
    int count = 0;
    
    
    
    while(count <3){
      
      Scanner scan = new Scanner(System.in);
      System.out.println("\nWhich number do you wish to find?");
      int userInt = scan.nextInt();
      
      IntCounter ic = new IntCounter(makeArray());
      ic.showTarget(userInt);
      count++;
    }
    System.out.println("\nFinished");
  }
}

