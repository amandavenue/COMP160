import javax.swing.*;
import java.awt.*;
/** Diner.java
  * Amanda Veldman September 2016
  * creates a diner, name, gender and location at the table
  */

public class Diner{
    private int x;
    private int y;
    private String name;
    private int seatNum;
    private Color color;
    private int diameter = 50;     // data field decliration 
    
    /** Constructor method
      * @params x, y, name, color, and seatNum assigned */
    public Diner(int x, int y, String name, Color color, int seatNum){
      this.x = x;
      this.y = y;
      this.name = name;
      this.color = color;
      this.seatNum = seatNum;
    }
    
    /** draws the individual diner's circle and things */
    public void draw (Graphics g){
      Font boldH14 = new Font ("Helvetica", Font.BOLD, 14);
      Font plainC8 = new Font ("Courier", Font.PLAIN, 8);
      g.setColor(color);
      g.fillOval(x,y,diameter,diameter);
      g.setColor(Color.black);
      g.setFont(boldH14);
      g.drawString(name, (x+5), (y+32));
      g.setFont(plainC8);
      g.drawString((""+seatNum), (x+25), (y+8));
    }
}

