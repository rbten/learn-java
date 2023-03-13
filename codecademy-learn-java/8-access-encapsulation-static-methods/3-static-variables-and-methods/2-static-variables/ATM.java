public class ATM {
  // static variables
  public static int totalMoney = 0;
  public static int numATMs = 0;

  // instance variables
  public int money;

  // constructor
  public ATM(int inputMoney) {
    this.money = inputMoney;
  }

  public void withdrawMoney(int moneyToWithdraw) {
    if(moneyToWithdraw <= this.money) {
      this.money -= moneyToWithdraw;
    }
  }


  public static void main(String[] args) {
    ATM firstATM = new ATM(1000);
    ATM secondATM = new ATM(500);

    System.out.println(ATM.totalMoney);
    System.out.println(firstATM.totalMoney);
    System.out.println(secondATM.totalMoney);
  }
}