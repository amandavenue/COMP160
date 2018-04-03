/** bookapp.java
 * Amanda Veldman August 2016
 * makes instances of box and excecutes them
 */

public class BoxApp{
  
  public static void main (String[] args){
    
    Box box1 = new Box();       // set box1
    box1.setHeight(4);
    box1.setWidth(4);
    box1.setLength(6);
    System.out.println(box1.toString()); // display box1
    
    Box box2 = new Box(3,4,5);           // set box2
    System.out.println(box2.toString()); // display box2
    
    Box box3 = new Box(5);               // set box3
    System.out.println(box3.toString()); // display box3
  }
}
