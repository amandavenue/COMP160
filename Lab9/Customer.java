/** Customer.java
  * Amanda Veldman August 2016
  * Sets variables for customer infromation
  */

public class Customer{
  private String name;
  private boolean child;
  private boolean student;
  private boolean booked;   // declaration of data fields
  
  /** constructor method*/
  public Customer(String nameIN, int age, boolean studentIN){
    name = nameIN;
    child = (age >= 5 && age <=16);
    student = studentIN;
  }
  
  /** gets name of customer
    * @return name */
  public String getName(){
    return name;
  }
  
  /** gets if customer is a child or not
    * @return child */
  public boolean isChild(){
    return child;
  }
  
  /** gets if customer showed studentID
    * @return student */
  public boolean isStudent(){
    return student;
  }
  
  /** sets booked variable
    * @param booked */
  public void setBooked(){
    booked = true;
  }
  
  /** gets if customer is booked or not
    * @return booked */
  public boolean isBooked(){
    return booked;
  }
}

