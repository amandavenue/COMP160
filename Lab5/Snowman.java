import javax.swing.*;
import java.awt.*;
/**
 * Snowman.java       Adapted from: Lewis, DePasquale & Chase page 971 (835 2nd edition)
 * 
 * Demonstrates basic drawing methods and the use of color.
 * Amanda Veldman July 2016
 */
public class Snowman extends JFrame{
  
  
  /** creates  an instance of the Snowman class called frame and sets some essential parameters.
   * You do not need to understand how this method works until later in the course*/
  public static void main(String[]args){
    Snowman frame = new Snowman();  
    frame.setSize(300,220);
    frame.setVisible(true);
  }
  
  /**  Draws a snowman.*/
  public void paint (Graphics page)
  {
    final int MID = 100;
    final int TOP = 50;
    setTitle("Snowman");
    page.setColor (Color.cyan);
    page.fillRect(0,0,300,220);  //background;
    
    page.setColor (Color.blue);
    page.fillRect (0, 175, 300, 50);  // ground
    
    page.setColor (Color.yellow);
    page.fillOval (270, -40, 80, 80);  // sun
    
    page.setColor (Color.white);
    page.fillOval (MID -20, TOP, 40, 40);      // head
    page.fillOval (MID - 35, TOP + 35, 70, 50);   // upper torso
    page.fillOval (MID - 50, TOP + 80, 100, 60);  // lower torso

    page.setColor (Color.black);
    page.fillOval (MID - 10, TOP + 10, 5, 5);   // left eye
    page.fillOval (MID + 5, TOP + 10, 5, 5);    // right eye
    
    page.drawArc (MID - 10, TOP + 20, 20, 10, 10, 160);   // mouth
    
    page.drawLine (MID - 25, TOP + 60, MID - 50, TOP + 40);  // left arm
    page.drawLine (MID + 25, TOP + 60, MID + 55, TOP + 60);  // right arm
    
    page.drawLine (MID - 20, TOP + 5, MID + 20, TOP + 5);  // brim of hat
    page.fillRect (MID - 15, TOP - 20, 30, 25);        // top of hat
    
    page.setColor(Color.red);
    page.fillOval(MID - 2, TOP + 50, 4, 4);
    page.fillOval(MID - 2, TOP + 65, 4, 4);//upper torso buttons
    
    page.setColor(Color.black);
    page.drawString("Amanda Veldman",10,50); //my name
  }
}
