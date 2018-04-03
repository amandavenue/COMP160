/**
 Pie.java
 Provided for Part 2, Lab5, COMP160 2016 
 Amanda Veldman July 2016
 draws a pie chart with 8 pieces and one sticking out
 */

import javax.swing.*;
import java.awt.*;

public class Pie extends JFrame{
    
    /** creates  an instance of Pie called chart1*/
    public static void main(String[]args){
        Pie chart1 = new Pie(); 
        chart1.setSize(300,220);
        chart1.setVisible(true);
        
    }
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paint (Graphics page){
        int X = 60;
        int Y = 30;
        int WID = 180;
        int HEI = 180;
        int LEN = 45; // set standard pie variables
        page.setColor(Color.white);
        page.fillRect(0,0,300,220); // bg
        
        page.setColor(Color.black);
        page.fillArc(X + 6, Y - 3, WID, HEI, 0, LEN); //sticking out piece
        page.setColor(Color.blue);
        page.fillArc(X, Y, WID, HEI, 45, LEN);
        page.setColor(Color.green);
        page.fillArc(X, Y, WID, HEI, 90, LEN);
        page.setColor(Color.yellow);
        page.fillArc(X, Y, WID, HEI, 135, LEN);
        page.setColor(Color.orange);
        page.fillArc(X, Y, WID, HEI, 180, LEN);
        page.setColor(Color.red);
        page.fillArc(X, Y, WID, HEI, 225, LEN);
        page.setColor(Color.pink);
        page.fillArc(X, Y, WID, HEI, 270, LEN);
        page.setColor(Color.magenta);
        page.fillArc(X, Y, WID, HEI, 315, LEN); // pie pieces (45 degrees)
    }
}
