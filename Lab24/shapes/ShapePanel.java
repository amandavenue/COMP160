package shapes;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

/** ShapePanel.java
  * Amanda Veldman September 2016
  * creates a frame and adds the control panel and the drawing panel */

public class ShapePanel extends JPanel{
  
  ArrayList<Shape> shapes = new ArrayList<Shape>();
  private DrawingPanel drawPanel;
  private JPanel controlPanel;
  private JButton circle;
  private JButton square;
  private JButton smiley;
  private JButton oval;
  private JButton swirl;
  private JButton start;
  private JButton stop;
  private JButton remove;
  private JTextField showNum;
  private JLabel removeLabel;
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
    remove = new JButton("Remove");
    showNum = new JTextField(2);
    removeLabel = new JLabel("Remove which?");
    drawPanel = new DrawingPanel();       // creates all components
    
    JButton [] buttons = {circle, square, smiley, oval, swirl, start, stop, remove};
    
    ButtonListener listener = new ButtonListener();
    for (int i = 0; i < buttons.length; i++){
      buttons[i].addActionListener(listener);
      controlPanel.add(buttons[i]);             // adds listeners to the buttons
    }
    
    timer = new Timer(DELAY, listener);
    
    controlPanel.add(removeLabel);               // add components to the control panel
    controlPanel.add(showNum);
    
    add(controlPanel);
    add(drawPanel);                       // adds panels to the frame
    
    controlPanel.setPreferredSize(new Dimension(100,400));
  }
  
  /** inner priavte class
    * listens for ActionEvents and creates shapes in the shapes array */
  private class ButtonListener implements ActionListener{
    
    public void actionPerformed (ActionEvent event){
      if (event.getSource() == timer){
        for(Shape s:shapes){
          s.move();
        }
      } else {
        JButton button = (JButton) event.getSource();
        if (button.getText().equals("Circle")){
          shapes.add(new Circle());
          count ++;
        } else if (button.getText().equals("Square")){
          shapes.add(new Square());
          count ++;
        } else if (button.getText().equals("Smiley")){
          shapes.add(new Smiley());
          count ++;
        } else if (button.getText().equals("Oval")){
          shapes.add(new Oval());
          count ++;
        } else if (button.getText().equals("Swirl")){
          shapes.add(new Swirl());
          count ++;
        } else if (button.getText().equals("Start")){
          timer.start();
        } else if (button.getText().equals("Stop")){
          timer.stop();
        } else if (button.getText().equals("Remove")){
          try{
          int in = Integer.parseInt(showNum.getText());
          shapes.remove(in);
          } catch (NumberFormatException z){
            System.out.println("No more shapes left to remove");
          } catch (IndexOutOfBoundsException b){
            System.out.println("There arent that many shapes");
          }
        }
      }
      if (shapes.size() == 0){
        showNum.setText("");
      } else {
        showNum.setText(Integer.toString(shapes.size()-1));
      }
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
      for(Shape s:shapes){
        s.display(g);
        s.showIndex(g, shapes.indexOf(s));
      }
    }
  }
}

