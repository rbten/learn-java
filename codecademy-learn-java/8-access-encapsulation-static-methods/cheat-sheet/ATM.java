public class ATM {
  // Static variables
  public static int totalMoney = 0;
  public static int numATMs = 0;

  // instance variables
  public int money = 1;

  // A static method
  public static void averageMoney(){
    System.out.println(totalMoney / numATMs);
    // can not use this.money
  }

  public static void staticMethod() {
    totalMoney++;
  }

  public static void main(String[] args) {
    System.out.println("Total money of ATMs: " + ATM.numATMs);

    ATM.averageMoney();
  }
}