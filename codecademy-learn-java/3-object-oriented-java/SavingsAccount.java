public class SavingsAccount{
  double balance;

  // constructor
  public SavingsAccount(double inputBalance){
    balance = inputBalance;
  }

  // deposit method
  public void deposit(double amountToDeposit){
    double updateBalance = balance + amountToDeposit;
    balance = updateBalance;
  }

  // withdrawing method
  public void withdraw(double amountToWithdraw){
    double updateBalance = balance - amountToWithdraw;
    balance = updateBalance;
  }

  // check ballance method
  public void checkBallance(){
    System.out.println("Your account: "+balance);
  }

  public static void main(String[] args){
    SavingsAccount myBankAcc = new SavingsAccount(2000);
    myBankAcc.checkBallance();
    myBankAcc.deposit(100);
    myBankAcc.checkBallance();
    myBankAcc.withdraw(200);
    myBankAcc.checkBallance();
  }
}