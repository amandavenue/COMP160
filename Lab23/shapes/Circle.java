package shapes;
import java.awt.*;

/** Circle.java
  * Amanda Veldman September 2016
  * creates circles. extends the shape abstract class */

public class Circle extends Shape{
  
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}
