import java.awt.Color;
/** MyFrameApp.java
  * Amanda Veldman August 2016
  * makes instances of MyFrame and excecutes them
  */

public class MyFrameApp extends MyFrame{
  
  public static void main (String [] args){
    MyFrame m1 = new MyFrame(); // create instance of MyFrame called m1
    m1.setSize(300,150); 
    m1.setVisible(true); 
    m1.decorate(Color.pink, "Pink Einstein", 0);
    
    MyFrame m2 = new MyFrame(); // create instance of MyFrame called m2
    m2.setSize(300,150);
    m2.setVisible(true);
    m2.decorate(Color.blue, "Blue Einstein", 180);
  }
}

  