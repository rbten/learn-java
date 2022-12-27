public class BakeSale {
  public static void main(String[] args) {
    int numCookies = 17;

    //A customer buys 3 cookies
    numCookies -=3;

    //A customer buys half of remaining cookies
    numCookies /= 2;

    //The remaining cookies
    System.out.println(numCookies);
  }
}