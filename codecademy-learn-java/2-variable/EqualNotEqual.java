public class EqualNotEqual {
  public static void main(String[] args) {
    checkPaycheckAmount();
    checkUpdatedBalance();
    learnEqualNotEqual();
  }

  static void checkPaycheckAmount() {
    // Input paycheck
    double paycheckAmount = 620;
    double calculatedPayCheck = 15.50*40;

    // Check paycheck
    boolean checkPaycheck = paycheckAmount == calculatedPayCheck;

    System.out.println("A good boss: "+checkPaycheck); 
  }

  static void checkUpdatedBalance() {
    // Input balance and updated balance
    double balance = 20000.0;
    double amountToDeposit = 620;
    double updatedBalance = balance + amountToDeposit;


    // Check updated balance
    boolean checkUpdatedBalance = balance != updatedBalance;

    System.out.println("Your balance updated: "+checkUpdatedBalance);
  }

  static void learnEqualNotEqual() {
    // Input 
    int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;

    // Check 2 albums
    boolean sameNumberOfSongs = songsA == songsB;
    boolean differentLength = albumLengthA != albumLengthB;

    System.out.println("Two albums have same number of songs: "+sameNumberOfSongs);
    System.out.println("Two albums have different number of lengths: "+differentLength);
  }
}