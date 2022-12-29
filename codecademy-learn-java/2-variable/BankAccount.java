public class BankAccount {
  public static void main(String[] args) {
    double balance = 1000.75;
    double amountToWithdraw = 250;

    // Update the balance
    double updatedBalance = balance - amountToWithdraw;

    double amountForEachFriend = updatedBalance/3;

    boolean canPurchaseTicket = amountForEachFriend >= 250;

    System.out.println(canPurchaseTicket);

    System.out.println("I gave each friend "+amountForEachFriend+"...");
  }
}