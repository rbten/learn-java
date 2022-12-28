public class GreaterLessThan {
  public static void main(String[] args) {
    checkToWithdraw();
    checkToBuyLaptop();
    checkToGraduate();
  }

  static void checkToWithdraw() {
    // Inputs
    double balance = 20000.01;
    double amountWithdraw = 5000.01;

    // Check
    boolean availableToWithdraw = amountWithdraw < balance;

    // Result
    System.out.println("Available to withdraw: "+availableToWithdraw);
  }

  static void checkToBuyLaptop() {
    // Inputs
    double myBalance = 200.05;
    double priceOfNewLap = 1000.05;

    // Check
    boolean availableToBuyLap = myBalance > priceOfNewLap;

    // Result
    System.out.println("Available to buy: "+availableToBuyLap);
  }

  static void checkToGraduate() {
    // Inputs
    double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;

    // Check
    boolean availableToGraduate = creditsEarned >= creditsToGraduate;

    //Result
    System.out.println("Graduate: "+availableToGraduate);
  }
}