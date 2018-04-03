package shapes;
import java.awt.*;

/** Square.java
  * Amanda Veldman September 2016
  * creates squares. extends the shape abstract class */

public class Square extends Shape{
  
  public void display(Graphics g){
    g.setColor(colour);
    g.fillRect(x, y, width, height);
  }
}