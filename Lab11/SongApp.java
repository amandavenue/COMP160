/** SongApp.java
  * Amanda Veldman August 2016
  * Creates instances of Song and excecutes them
  */

public class SongApp{
  
  public static void main (String[] args){
    
    Song song1 = new Song("While my guitar gently weeps");
    Song song2 = new Song("Let it be");
    Song song3 = new Song("Penny Lane");       // creates new instances of song
    
    System.out.println(song1.toString());
    song1.process();
    
    System.out.println(song2.toString());
    song2.process();
    
    System.out.println(song3.toString());
    song3.process();
  }
}
