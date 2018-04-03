/** Triangle.java
  * Amanda Veldman August 2016
  * Works out the oerimeter of a triangle
  */

public class Triangle{
  private int p1x;
  private int p1y;
  private int p2x;
  private int p2y;
  private int p3x;
  private int p3y; 
  private String name;          //data field declaration
  
  /** constructor method for triangle */
  public Triangle(int pt1x, int pt1y, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn){
    p1x = pt1x;
    p1y = pt1y;
    p2x = pt2x;
    p2y = pt2y;
    p3x = pt3x;
    p3y = pt3y;
    name = nameIn;
  }
  
  /** length of side calculation
    * @return sidelen is length of side */
  private double calcSide(int x1, int y1, int x2, int y2){
    double sidelen = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    return sidelen;
  }
  
  /** work out perimeter
    * @return total length of all sides */
  public double getPerimeter(){
    double s1 = calcSide(p1x, p1y, p2x, p2y);
    double s2 = calcSide(p2x, p2y, p3x, p3y);
    double s3 = calcSide(p3x, p3y, p1x, p1y);
    return s1 + s2 + s3;
  }
  
  /** get name of triangle
    * @return name */
  public String getName(){
    return name;
  }
}
  