/** Song.java
  * Amanda Veldman August 2016
  * uses a songLine to do lots of things
  */

public class Song{
  
  /** decliration of data fields */
  private String songLine;
  
  /** Constructor method
    * @param songLine is assigned */
  public Song(String sLine){
    songLine = sLine;
  }
  
  /** toString method
    * @return the songLine */
  public String toString(){
    return (songLine);
  }
  
  /** process method that excecutes lots of stuff to do with songLine */
  public void process(){
    int length = songLine.length();    //length variable so it can easily be used elsewhere
    System.out.println("Length is: " + length);
    System.out.println("Last character is: " + songLine.charAt(length - 1));
    int firstSpace = songLine.indexOf(" "); // firstspace index saved
    int secondSpace = songLine.indexOf(" ", (firstSpace + 1));   // second space index saved
    if (secondSpace != -1){ // some words dont have a second space
      System.out.println("First 2 words: " + songLine.substring(0, secondSpace));
      System.out.println("Rest of the song: " + songLine.substring((secondSpace + 1), (length)));
      System.out.println("First letter of third word is: " + songLine.charAt(secondSpace + 1));
    } else {
      System.out.println("Sorry some things couldn't be done");
    }
    System.out.println("Uppercase: " + songLine.toUpperCase());
    System.out.println("X instead of space: " + songLine.replace(" ", "x"));
    if (songLine.indexOf("b") != -1){  // some words dont have a b in them
      System.out.println("First b is here: " + songLine.indexOf("b"));
    }else{
      System.out.println("There arent any 'b's");
    }
    System.out.println(songLine);
    
  }
}
    