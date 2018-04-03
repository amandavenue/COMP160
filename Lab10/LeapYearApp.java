/** Leap Year App
  * Amanda Veldman Aug 2016
  * Works out if any particular year is a leap year or not
  */

public class LeapYearApp{
  
  public static void main (String[] args){
    
    leapYear(2014);
    leapYear(2016);
    leapYear(1990);
    leapYear(2000);
    leapYear(1565);   // test years to run in the leapYear method
    
  }
  
  /** works out if the year entered is a leap year or not and prints the result */
  public static void leapYear(int year){
    if (year >= 1582){
      if ((year%4 == 0) && ((year%100 == 0 && year%400 == 0) || !(year%100 == 0 && year%400 == 0))){
        System.out.println(year + ": is a leap year");
      } else {
        System.out.println(year + ": is not a leap year");
      }
    } else {
      System.out.println(year + ": predates the Georgian calendar");
    }
  }
}
