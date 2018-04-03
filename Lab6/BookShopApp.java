/** BookShopApp
  * Amanda Veldman August 2016
  * Makes instances of book.java and excecutes them
  */

public class BookShopApp{
  
  public static void main (String [] args){
    
    Book b1 = new Book();      // set book 1
    b1.setTitle("Life of Pi");
    b1.setPages(273);
    b1.setPrice(28.90);
    
    Book b2 = new Book();     // set book 2
    b2.setTitle("Mr Pip");
    b2.setPages(240);
    b2.setPrice(22.70);
    
    Book b3 = new Book();     // set book 3
    b3.setTitle("The Handmaid's Tale");
    b3.setPages(324);
    b3.setPrice(29.99);
    
    b1.displayBook();
    b2.displayBook();
    b3.displayBook();        // display books
    
  }
}