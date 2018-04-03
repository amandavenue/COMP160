import javax.swing.*;
/** TabelPanelApp.java
  * Amanda Veldman September 2016
  * creates a new JFrame object, new instance of TablePanel, sets visible
  */

public class TabelPanelApp{
  
  public static void main (String [] args){
    JFrame frame = new JFrame("Table Setting");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TablePanel());
    frame.pack();
    frame.setVisible(true);
  }
}
