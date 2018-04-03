/** MultiApp.java
  * Amanda Veldman September 2016
  * Prints out a 12 x 12 multiplication table
  */

public class MultiApp{
  
  public static void main(String [] args){
    int cols = 12;
    int rows = 12;
    int [] [] table = new int[rows][cols];
    for (int row = 1; row <= rows; row++){
      for (int col = 1; col <= cols; col++){
        System.out.print (col*row + "\t");
      }
      System.out.print("\n");
    }
  }
}