public class Modulo {
  public static void main(String[] args) {
    calculateCookiesLeft();
    oddOrEvenNumber();
    learnModule();
  }

  static void calculateCookiesLeft() {
    int cookiesBaked = 10;
    int cookiesLeftOver = 10%3;
    System.out.println("cookiesLeftOver: " + cookiesLeftOver);
  }

  static void oddOrEvenNumber() {
    int remainderOfSeven = 7%2;
    System.out.println("Remainder of 7: "+remainderOfSeven);
    int remainderOfEight = 7%2;
    System.out.println("Remainder of 8: "+remainderOfEight);
  }

  static void learnModule() {
    int students = 26;
    int leftOut = 26%3;
    System.out.println(leftOut);
  }
}