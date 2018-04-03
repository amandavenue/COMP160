import javax.swing.*;
import java.awt.*;
/**  
 * Lab 6, Part 1, COMP160
 * MyFrame.java
 * Make our own version of a JFrame class
 */
public class MyFrame extends JFrame {
  /** Make our own paint method */
  public void paint(Graphics g) {
    g.drawRect(50,50,40,40);       // square
    g.drawRect(60, 80, 225, 30);   // rectangle       
    g.drawOval(75, 65, 20, 20);    // circle
    g.drawLine(35, 60, 100, 120);  // line
    g.drawString("Out of clutter, find simplicity", 100, 70);
    g.drawString("-- Albert Einstein", 130, 100);
  }//end paint
  
  public void decorate (Color shade, String title, int yOffset){ 
    /** make a decorate method which can be applied in myframeapp */
    setBackground(shade);
    setTitle(title);
    setLocation(0,yOffset); 
  } // end decorate
 
}//end class
