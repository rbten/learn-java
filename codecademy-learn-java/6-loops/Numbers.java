public class Numbers {
  public static void main(String[] args) {
    for (int i = 5; i < 100; i+=5) {
      if ((i % 5) != 0) {
        continue;
      }

      System.out.println(i);
    }
  }
}