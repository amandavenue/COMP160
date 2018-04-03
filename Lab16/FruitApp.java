  import java.util.Scanner;
  /** FruitApp.java
    * Amanda Veldman September 2016
    * Takes three fruits and asks the user to guess what they are
    */
  
  public class FruitApp{
  
  public static void main(String [] args){
    String [] fruits = new String [3];
    int c = 0;
    
    while(c<3){
      Scanner scan = new Scanner(System.in);
      System.out.println("\nEnter a fruit: ");
      fruits [c] = scan.nextLine();
      c++;
    }
    
    for (String f: fruits){
      boolean guessed = false;
      do {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Guess what fruit I am?" + "\t" + f.substring(0,2) +"\t" + f.length() + " letters");
        String guess = scanf.nextLine();
        if (guess.equals(f)){
          System.out.println("Correct\n");
          guessed = true;
        } else {
          System.out.println("Try Again\n");
        }
      } while (!guessed);
    }
  }
}