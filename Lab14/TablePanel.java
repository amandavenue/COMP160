import javax.swing.*;
import java.awt.*;
/** TablePanel.java
  * Amanda Veldman September 2016
  * draws up the table plan for all diners
  */

public class TablePanel extends JPanel{
  private Diner diner1;
  private Diner diner2;
  private Diner diner3;
  private Diner diner4;
  private Diner diner5;
  private Diner diner6;    //declares diners
  
  /** constructor method
    * @params diner1-6, also sets size of window and background color */
  public TablePanel(){
    diner1 = new Diner(125,50,"David", Color.blue, 1);
    diner2 = new Diner(200, 125, "Clare", Color.red, 2);
    diner3 = new Diner(200, 200, "Michael", Color.blue,3);
    diner4 = new Diner(125,275, "Metiria", Color.red, 4);
    diner5 = new Diner(50, 200, "Todd", Color.blue, 5);
    diner6 = new Diner(50, 125, "Jacqui", Color.red, 6);
    
    setPreferredSize(new Dimension(300,350));
    setBackground(Color.gray);
  }
  
  /** draws each diners things and the table */
  public void paintComponent (Graphics g){
    super.paintComponent(g);
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    g.setColor(Color.black);
    g.fillRect(125,125,50,125);
  }
}
