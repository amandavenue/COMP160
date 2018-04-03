/** Average.java
  * Amanda Veldman September 2016
  * works out the average of each row in a 2 dimentional array
  */

public class Average{
  
  public static void main (String [] args){
    int [] [] table = {{1,2,3},{4,5,6},{7,8}};
    for (int row = 0; row < table.length; row++){
      double tot = 0;
      for (int col = 0; col < table[row].length; col++){
        System.out.print(table[row][col] + " ");
        tot += table[row][col];
      }
      System.out.print("\t Average : " + tot/(table[row].length) + "\n");
    }
  }
}
