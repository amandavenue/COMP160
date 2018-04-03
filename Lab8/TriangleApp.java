import java.text.DecimalFormat;
/** TriangleApp
  * Amanda Veldman August 2016
  * makes instances of triangle and excecutes them
  */

public class TriangleApp{
  
  public static void main (String [] args){
    DecimalFormat fmt = new DecimalFormat("0.##");   // set decimal format
    
    Triangle t1 = new Triangle(0,3,3,4,1,9,"A");     // set triangle A
    System.out.println("Triangle " + t1.getName() + " perimeter is " + fmt.format(t1.getPerimeter()) + " units");
    
    Triangle t2 = new Triangle(0,0,3,0,3,4,"B");     // set triangle B
    System.out.println("Triangle " + t2.getName() + " perimeter is " + fmt.format(t2.getPerimeter()) + " units");
  }
}

  