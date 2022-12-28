public class Song {
  public static void main(String[] args) {
    // Print a song
    String openingLyrics = "Yesterday, all my troubles seemed so far away";
    System.out.println(openingLyrics);

    // Check the equality of two songs
    String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
    String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";

    System.out.println("line1 = line2: "+line1.equals(line2));
    System.out.println("line2 = line2: "+line2.equals(line3));

  }
}