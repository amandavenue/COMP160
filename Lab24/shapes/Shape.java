package shapes;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

/** Shape.java
  * Amanda Veldman September 2016
  * creates circles of random sizes and colours */

public abstract class Shape{
  
  int x;
  int y;
  int width;
  int height;
  Color colour;
  int moveX = 1;
  int moveY = 1;
  int change = 1;
  
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
  
  /** alters x, y, and colour to create the animation */
  public void move(){
    Random generator = new Random();
    if (change % 2 == 0){
      colour = new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255));
      change++;
    } else {
      change ++;
    }                           // colour change every 2 increments of change
    
    if (x >= 400-width){
      moveX = -moveX;
    } else if (x <= 0 ) {
      moveX = (-1)*(moveX);
    }                           // increments moveX
    if (y >= 400-height){
      moveY = -moveY;
    } else if (y <= 0 ) {
      moveY = (-1)*(moveY);
    }                           // increments moveY
    if (width > 15){
      y += moveY;
    } else {
      x += moveX;
    }                          // wider than 15 pixels move up and downn, else sideways
  }
  
  /** method to show the index of each shape */
  public void showIndex(Graphics g, int i){
    String z = Integer.toString(i);
    g.setColor(Color.black);
    g.drawString(z, x, y);
  }
  
  /** draws a random val based on the randomly set data fields */
  public abstract void display(Graphics g);
  
  
}
