/** intcounter.java
  * Amanda Veldman September 2016
  * sets an array of int so that it can be searched through to find a user input int
  */

public class IntCounter{
  
  private int [] numArray;
  
  /** constructor method
   * @param numArray also prits out the array on one line and the length */
  public IntCounter(int [] numArray){
    this.numArray = numArray;
    for(int num: numArray){
      System.out.print(num + " ");
    }
    System.out.print("Array is of length " + numArray.length +"\n");
  }
  
  /** takes an int as param, finds index value of where the int is in numArray */
  public void showTarget(int target){
    int i;
    for(i = 0; i < numArray.length; i++){
      if(numArray[i] == target){
        System.out.println("\tThere is a " + target + " in position " + i);
      }
    }
  }
  
}