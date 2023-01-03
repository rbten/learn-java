public class SavingsAccount {
  int balance;

  public SavingsAccount(int inputBalance) {
    balance = inputBalance;
  }

  public static void main(String[] args) {
    SavingsAccount myBankAcc = new SavingsAccount(2000);

    // Check account
    System.out.println("Your balance: "+myBankAcc.balance);

    // Withdrawing
    int afterWithdraw = myBankAcc.balance-300;
    myBankAcc.balance = afterWithdraw;
    System.out.println("You just withdraw: "+300);

    // Check account
    System.out.println("Your balance: "+myBankAcc.balance);

    // Deposit
    int afterDeposit = myBankAcc.balance+600;
    myBankAcc.balance = afterDeposit;
    System.out.println("You just deposit: "+600);

    // Check account
    System.out.println("Your balance: "+myBankAcc.balance);

    // Deposit
    int afterDeposit2= myBankAcc.balance+600;
    myBankAcc.balance = afterDeposit2;
    System.out.println("You just deposit: "+600);

    // Check account
    System.out.println("Your balance: "+myBankAcc.balance);
  }
}