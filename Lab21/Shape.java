import java.awt.*;
import javax.swing.*;
import java.util.Random;

/** Shape.java
  * Amanda Veldman September 2016
  * creates circles of random sizes and colours */

public class Shape{
  
  private int x;
  private int y;
  private int width;
  private int height;
  private Color colour;
  
  /** @return random number between the range given */
  public int randomRange(int lo, int hi){
    Random generator = new Random();
    int rand;
    
    rand = generator.nextInt(hi) + lo;
    return rand;
  }
  
  /** counstructor method
    * sets random height, width and colour */
  public Shape(){
    Random generator = new Random();
    width = generator.nextInt(20) + 10;
    height = width;
    
    x = generator.nextInt(400-width);
    y = generator.nextInt(400-height);
    
    colour = new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255));
  }
  
  /** draws a random val based on the randomly set data fields */
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}
