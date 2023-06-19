import java.util.Scanner;

public class ScanningTheInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String myName = scanner.next();

    System.out.println("Hello, " + myName + "!");
  }
}
