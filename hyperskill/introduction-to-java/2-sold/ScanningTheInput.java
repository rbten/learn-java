import java.util.Scanner;

public class ScanningTheInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String myName = scanner.next();

    String word1 = scanner.next();
    String line1 = scanner.nextLine();
    String word2 = scanner.next();
    String word3 = scanner.next();
    String line2 = scanner.nextLine();

    System.out.println("word1: " + word1);
    System.out.println("line1: " + line1);
    System.out.println("word2: " + word2);
    System.out.println("word3: " + word3);
    System.out.println("line2: " + line2);

  }
}
