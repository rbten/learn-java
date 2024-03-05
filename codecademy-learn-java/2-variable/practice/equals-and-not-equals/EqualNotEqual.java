public class EqualNotEqual {
    public static void main(String[] args) {
        double paycheckAmount = 620;
        double calculatedPaycheck = 15.5 * 40;
        boolean checkPaycheck = paycheckAmount == calculatedPaycheck;

        System.out.println("I got a right paycheck: " + checkPaycheck);

        double balance = 20000.0;
        double amountToDeposit = 620;
        double updatedBalance = balance + amountToDeposit;

        boolean balanceHasChanged = balance != updatedBalance;

        System.out.println("My balance updated: " + balanceHasChanged);
    }
}