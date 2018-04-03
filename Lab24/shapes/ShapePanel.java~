package shapes;
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
  private JButton circle;
  private JButton square;
  private JButton smiley;
  private JButton oval;
  private JButton swirl;
  private JButton start;
  private JButton stop;
  private JTextField showNum;
  private JLabel countLabel;
  private int count;
  Timer timer;
  private final int DELAY = 5;              // data field declerations
  
  JButton [] buttons = new JButton[7];
  
  /*creates and displays the traffic light program frame */
  public static void main(String [] args){
    
    JFrame frame = new JFrame("Lab 21");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.getContentPane().add(new ShapePanel());
    
    frame.pack();
    frame.setVisible(true);
  }
  
  /** Constructor */
  public ShapePanel(){
    
    controlPanel = new JPanel();
    circle = new JButton("Circle");
    square = new JButton("Square");
    smiley = new JButton("Smiley");
    oval = new JButton("Oval");
    swirl = new JButton("Swirl");
    start = new JButton("Start");
    stop = new JButton("Stop");
    showNum = new JTextField(2);
    countLabel = new JLabel("Count: ");
    drawPanel = new DrawingPanel();       // creates all components
    
    JButton [] buttons = {circle, square, smiley, oval, swirl, start, stop};
    
    ButtonListener listener = new ButtonListener();
    for (int i = 0; i < buttons.length; i++){
      buttons[i].addActionListener(listener);
      controlPanel.add(buttons[i]);             // adds listeners to the buttons
    }
    
    timer = new Timer(DELAY, listener);
    
    controlPanel.add(showNum);
    controlPanel.add(countLabel);               // add components to the control panel
    
    add(controlPanel);
    add(drawPanel);                       // adds panels to the frame
    
    controlPanel.setPreferredSize(new Dimension(100,400));
  }
  
  /** inner priavte class
    * listens for ActionEvents and creates shapes in the shapes array */
  private class ButtonListener implements ActionListener{
    
    public void actionPerformed (ActionEvent event){
      if (event.getSource() == timer){
        for(int i = 0; i<count; i++){
          shapes[i].move();
        }
      } else {
        JButton button = (JButton) event.getSource();
        if (button.getText().equals("Circle")){
          shapes[count] = new Circle();
          count ++;
        } else if (button.getText().equals("Square")){
          shapes[count] = new Square();
          count ++;
        } else if (button.getText().equals("Smiley")){
          shapes[count] = new Smiley();
          count ++;
        } else if (button.getText().equals("Oval")){
          shapes[count] = new Oval();
          count ++;
        } else if (button.getText().equals("Swirl")){
          shapes[count] = new Swirl();
          count ++;
        } else if (button.getText().equals("Start")){
          timer.start();
        } else if (button.getText().equals("Stop")){
          timer.stop();
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
        for(int i = 0; i<count; i++){
          shapes[i].display(g);
      }
    }
  }
}

