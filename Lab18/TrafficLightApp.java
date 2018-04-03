import javax.swing.JFrame;
/**TrafficLightApp.java
  * Amanda Veldman September 2016
  * creates a frame with two panels in it to make a traffic light
  */

public class TrafficLightApp{
  
  /*creates and displays the traffic light program frame */
  public static void main (String [] args){
    JFrame frame = new JFrame("Traffic Light");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.getContentPane().add(new TrafficLightPanel());
    
    frame.pack();
    frame.setVisible(true);
    
  }
}
