public class CheckingAccount {
  private String name;
  private int balance;
  private String id;

  public CheckingAccount(String inputName, int inputBalance, String inputId) {
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }

  private void addFunds(int fundsToAdd) {
    balance += fundsToAdd;
  }

  private void getInfo() {
    System.out.println("This checking account belongs to " + name + ". It has " + balance + " dollars in it.");
  }

  public int getBalance() {
    return balance;
  }
  
  public void setBalance(int newBalance) {
    balance = newBalance;
  }

  public static void main(String[] args) {
    CheckingAccount myAccount = new CheckingAccount("Robert", 100, "3");
    System.out.println(myAccount.balance);
    myAccount.addFunds(5);
    System.out.println(myAccount.balance);
  }

}