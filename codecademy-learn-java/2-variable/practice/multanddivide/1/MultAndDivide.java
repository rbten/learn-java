public class MultAndDivide {
    public static void main(String[] args) {

        double paycheckAmount = 40 * 15.50;
        System.out.println("Paycheck amount: " + paycheckAmount);

        double balance = 20010.5;
        double hourlyRate = 15.5;
        double hoursWorked = balance / hourlyRate;

        System.out.println("Balance: " + balance);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);

        int evenlyDivided = 10 / 5;
        int unevenlyDivided = 10 / 4;

        System.out.println("Evenly divided: " + evenlyDivided);
        System.out.println("Unevenly divided: " + unevenlyDivided);

        double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal + subtotal * tax;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);

        double perPerson = total / 4;
        System.out.println("Per Person: " + perPerson);
    }
}