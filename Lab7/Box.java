/** Box.java
  * Amanda Veldman August 2016
  * calculate the volume and surface area of a box
  */

public class Box{
  private int height;
  private int width;
  private int length;     //declaration of data fields
  
  /** constructor method */
  public Box(int h, int w, int l){
    height = h;
    width = w;
    length = l;
  }
  
  /** square constructor method */
  public Box(int c){
    height = c;
    width = c;
    length = c;
  }
  
  /** create default constructor */
  public Box(){
  }
  
  /**set height mutator method
    * @param h is height */
  public void setHeight(int h){
    height = h;
  }
  
  /** set width mutator method
    * @param w is width */
  public void setWidth(int w){
    width = w;
  }
  
  /** set length mutator method
    * @param l is length */
  public void setLength(int l){
    length = l;
  }
  
  /** accessor method for surface area calc
    * @return the surface area */
  public int getSurfaceArea(){
    return (2*(height*width)+2*(width*length)+2*(length*height));      // surface area formula
  }
  
  /** accessor method for volume calc
    * @return the volume */
  public int getVolume(){
    return height*width*length;     // volume formula
  }
  
  /** toString
    * @return the string to be displayed */
  public String toString(){
    return ("Height is: " + height + ", Length is: " + length + ", Width is: " + width + ", Volume is: " + getVolume() + ", Surface Area is: " + getSurfaceArea());
  }
}

