public class CheckingAccount {
    private String name;
    private int balance;

    private int id;


    public CheckingAccount(String iName) {
        this.name = iName;
        this.balance = 0;
        this.id = (int)(Math.random() * 1001) + 1;
    }

    // accessor method
    public int getBalance() {
        return this.balance;
    }

    // mutator method
    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public void showMyAccount() {
        System.out.println(this.name);
        System.out.println(this.balance);
        System.out.println(this.id);
    }

    public static int sumTwo (int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        CheckingAccount accountOne = new CheckingAccount("Harry");
        accountOne.showMyAccount();

        CheckingAccount accountTwo = new CheckingAccount("Larry");
        accountTwo.showMyAccount();

        CheckingAccount accountThree = new CheckingAccount("Henry");
        accountThree.showMyAccount();

        accountOne.setBalance(3000);
        accountOne.showMyAccount();

        System.out.println(sumTwo(10, 2));
    }
}