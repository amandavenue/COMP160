import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** TrafficLightPanel.java
  * Amanda Veldman September 2016
  * creates components and listens to events for button panel and light panel
  */

public class TrafficLightPanel extends JPanel{
  
  private JButton red, amber, green;
  private JLabel buttonLabel, lastPressed;
  private JPanel buttonPanel, lightPanel;  //data field declarations
  
  /**Constructor method 
    * stes up the GUI*/
  public TrafficLightPanel(){
    
    
    amber = new JButton("Amber");
    green = new JButton("Green");               //create buttons
    
    buttonLabel = new JLabel("Button Panel");
    lastPressed = new JLabel("Last Pressed");  //create labels
    
    ButtonListener listener = new ButtonListener();  
    red.addActionListener(listener);
    amber.addActionListener(listener);
    green.addActionListener(listener);         // add listeners to buttons
    
    buttonPanel = new JPanel();
    buttonPanel.setPreferredSize(new Dimension(80,290));
    buttonPanel.setBackground(Color.white);
    buttonPanel.add(buttonLabel);
    buttonPanel.add(red);
    buttonPanel.add(amber);
    buttonPanel.add(green);                    // add components to buttonPanel 
    
    setBackground(Color.blue);
    add(buttonPanel);                          // add buttonPanel to TrafficLightPanel
    
    LightPanel lightPanel = new LightPanel();
    add(lightPanel);
    
    setPreferredSize(new Dimension(200,300));
  }
  
  /** inner priavte class
    * listens for ActionEvents */
  private class ButtonListener implements ActionListener{
    public void actionPerformed (ActionEvent event){
      if (event.getSource() == red){
        lastPressed.setText("Red");
        buttonPanel.setBackground(Color.red);
      } else {
        if (event.getSource() == amber){
          lastPressed.setText("Amber");
          buttonPanel.setBackground(Color.orange);
        } else {
          lastPressed.setText("Green");
          buttonPanel.setBackground(Color.green);
        }
      }
      repaint();
    }
  }
  
  /** inner priavte class
    * paints components of the traffic light panel*/
  private class LightPanel extends JPanel{
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor(Color.black);
      g.fillOval(20,30,40,40);
      g.fillOval(20,80,40,40);
      g.fillOval(20,130,40,40);
      setPreferredSize(new Dimension(80,290));
      setBackground(Color.cyan);
      
      String text = lastPressed.getText();
      
      if(text.equals("Red")){
        g.setColor(Color.red);
        g.fillOval(20,30,40,40);
      }
      if(text.equals("Amber")){
        g.setColor(Color.orange);
        g.fillOval(20,80,40,40);
      }
      if(text.equals("Green")){
        g.setColor(Color.green);
        g.fillOval(20,130,40,40);
      }
    }
  }
}

