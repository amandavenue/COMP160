package shapes;
import java.awt.*;
import java.util.Random;

/** Smiley.java
  * Amanda Veldman September 2016
  * creates smileys. extends the shape abstract class */

public class Smiley extends Shape{
  
  /** constructor
    * sets both height and width to 30 pixels always */
  public Smiley(){
    height = 30;
    width = 30;
  }
  
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, width, height);
    g.setColor(Color.black);
    g.drawOval(x+7, y+8, 4, 4);
    g.drawOval(x+20, y+8, 4, 4);
    g.drawArc(x+8, y+10, 15, 13, 190, 160);
  }
}