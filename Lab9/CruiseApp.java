import java.text.NumberFormat;
import java.util.Scanner;
/** application class for Customer.java
  * Lab 9 COMP160
  * Creates instances of customer.java and excecutes them
  */

public class CruiseApp{
  
  public static void main(String[]args){
    //each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);   // set customer information
    confirmBooking(customer1); 
    confirmBooking(customer2);
    confirmBooking(customer3); 
    confirmBooking(customer4);
    confirmBooking(customer5); 
    confirmBooking(customer6);
    confirmBooking(customer7); 
    confirmBooking(customer8);   // ask to confirm booking
    showBooked(customer1);
    showBooked(customer2);
    showBooked(customer3);
    showBooked(customer4);
    showBooked(customer5);
    showBooked(customer6);
    showBooked(customer7);
    showBooked(customer8);      // prints list of booked customers
  }
  
  /** displays and calculates cutomer data and asks to comfirm booking */
  public static void confirmBooking(Customer customer){
    
    double ticket = 56.0;
    double meal = 30.0;
    NumberFormat fmt = NumberFormat.getCurrencyInstance();;
    
    if (customer.isChild() || customer.isStudent()){ // calculating ticket price
      ticket = ticket/2;
    }else{
      ticket = ticket*0.8;
    }
    
    if (customer.isChild()){       // calculating meal price
      meal = meal/2;
    }else{
      meal = meal*0.9;
    }
    
    System.out.println(customer.getName());
    System.out.println("Ticket Price: " + fmt.format(ticket));
    System.out.println("Meal Price: " + fmt.format(meal));
    System.out.println("Total Price: " + fmt.format(ticket+meal)); // displays customer data
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Confirm booking for " + customer.getName() + " (Y/N)"); // asks to confirm booking
    String ch = sc.nextLine();
    
    if (ch.equals("Y") || ch.equals("y")){
      customer.setBooked();
      System.out.println("Booked\n");
    }
  }
  
  /** prints a list of booked customers */
  public static void showBooked(Customer customer){
    if (customer.isBooked()){
      System.out.println(customer.getName() + " is booked");
    }
  }
}