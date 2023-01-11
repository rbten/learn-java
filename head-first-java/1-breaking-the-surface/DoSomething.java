public class DoSomething {
  public static void main(String[] args) {
    // Do something (statements)
    System.out.println("Do something (statements)");
    int x = 3;
    String name = "Dirk";
    x = x*17;
    // Print x
    System.out.println("x is: "+x);

    // Do something again and again (loops)
    System.out.println("Do something again and again (loops)");
    while (x > 12) {
      System.out.println("x is: "+x);
      x = x-1;
    }

    for (int i = 0; i < 10; i++) {
      System.out.println("i is now: "+i);
    }

    // Do something under this condition (branching)
    System.out.println("Do something under this condition (branching)");
    if (x == 10) {
      System.out.println("x must be 10");
    } else {
      System.out.println("x is not 10");
    }
  }
}