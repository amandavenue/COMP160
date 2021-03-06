import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** ShapePanel.java
  * Amanda Veldman September 2016
  * creates a frame and adds the control panel and the drawing panel */

public class ShapePanel extends JPanel{
  
  Shape [] shapes = new Shape [20];
  private DrawingPanel drawPanel;
  private JPanel controlPanel;
  private JButton addShape;
  private JTextField showNum;
  private JLabel countLabel;
  private int count;                  // data field declerations
  
  /*creates and displays the traffic light program frame */
  public static void main(String [] args){
    
    JFrame frame = new JFrame("Lab 21");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.getContentPane().add(new ShapePanel());
    
    frame.pack();
    frame.setVisible(true);
  }
  
  public ShapePanel(){
    
    controlPanel = new JPanel();
    addShape = new JButton("Add Shape");
    showNum = new JTextField(2);
    countLabel = new JLabel("Count: ");
    drawPanel = new DrawingPanel();       // creates all components
    
    ButtonListener listener = new ButtonListener();
    addShape.addActionListener(listener);   // adds listener to the button
    
    controlPanel.add(addShape);
    controlPanel.add(showNum);
    controlPanel.add(countLabel);         // add components to the control panel
    
    add(controlPanel);
    add(drawPanel);                       // adds panels to the frame
    
    controlPanel.setPreferredSize(new Dimension(100,400));
  }
  
  /** inner priavte class
    * listens for ActionEvents and creates shapes in the shapes array */
  private class ButtonListener implements ActionListener{
    
    public void actionPerformed (ActionEvent event){
      if (event.getSource() == addShape){
        if (count < shapes.length){
          shapes[count] = new Shape();
          count ++;
        }
      }
      showNum.setText(Integer.toString(count));
      drawPanel.repaint();
    }
  }
  
  /** inner priavte class
    * drawing panel draws the shapes in the array shapes*/
  private class DrawingPanel extends JPanel{
    
    public DrawingPanel(){
      setPreferredSize(new Dimension(400,400));
      setBackground(Color.pink);
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      if (count > 0){
        for(int i = 0; i<count; i++){
          shapes[i].display(g);
        }
      }
    }
  }
}

