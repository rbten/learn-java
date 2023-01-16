import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    // Add songs
    desertIslandPlaylist.add("\"Perfect\"");
    desertIslandPlaylist.add("\"My mom likes you\"");
    desertIslandPlaylist.add("\"Yes, I do\"");
    desertIslandPlaylist.add("\"Bang Bang Bang\"");
    desertIslandPlaylist.add("\"Lemon Tree\"");
    desertIslandPlaylist.add("\"One more night\"");

    System.out.println(desertIslandPlaylist);

    // Check the number of songs
    System.out.println("The number of songs: "+desertIslandPlaylist.size());

    // Remove 1 song
    desertIslandPlaylist.remove(0);
    System.out.println("After remove 1 song...");
    System.out.println(desertIslandPlaylist);
    System.out.println("The number of songs: "+desertIslandPlaylist.size());

    // Swap 2 songs
    String temp = desertIslandPlaylist.get(0);
    desertIslandPlaylist.set(0, desertIslandPlaylist.get(1));
    desertIslandPlaylist.set(1, temp);
    System.out.println("After swap 2 songs...");
    System.out.println(desertIslandPlaylist);
  }
  
}