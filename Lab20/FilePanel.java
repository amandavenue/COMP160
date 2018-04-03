import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
/** FilePanel.java
 * Lab 20, COMP160,  2016
 * 
 * a JPanel which creates 2 instances of Rectangle objects, 
 * stores them in an array, and draws them 
 */
public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  private String fileName = "Lab20data.txt";
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){   
    boolean f;
    Color c;
    try{
      Scanner fileScan = new Scanner(new File(fileName));
      while(fileScan.hasNextLine() && count < drawObjects.length){
        String inputLine = fileScan.nextLine();
        if (inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){    //check data from fone matches the required format
          Scanner scanLine = new Scanner(inputLine);
          int fill = scanLine.nextInt();       // set fill if statement 
          if (fill == 1){
            f = true;
          } else {
            f = false;
          }
          int color = scanLine.nextInt();      // colour set if statement
          if (color == 1){
            c = Color.red;
            System.out.print("red");
          } else if (color == 2){
            c = Color.blue;
          } else if (color == 3) {
            c = Color.green;
          } else {
            c = Color.magenta;
          }
          int x = scanLine.nextInt();
          int y = scanLine.nextInt();
          int w = scanLine.nextInt();
          int h = scanLine.nextInt();       // set size and locations of rectangles
          drawObjects[count] = new Rectangle(f,c,x,y,w,h);
          count++;
        }
      }
    } catch (FileNotFoundException e){
      System.out.println("File not found. Check file name and location");
      System.exit(1);
    }
    
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }
}
