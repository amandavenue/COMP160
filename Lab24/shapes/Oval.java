package shapes;
import java.awt.*;
import java.util.Random;

/** Oval.java
  * Amanda Veldman September 2016
  * creates ovals. extends the shape abstract class */

public class Oval extends Shape{
  
  /** constructor method
    * ensures ovals arent drawn off the bottom of the panel */
  public Oval(){
    height = 4 * width;
    if (y > 400 - height){
      y = y-height;
    }
  }
  
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}
