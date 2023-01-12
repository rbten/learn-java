public class CarLoan {
  // instance variables
  String nameOfCar;
  int carLoan, loanLength, interestRate, downPayment;

  // constructor
  public CarLoan(String carName, int loan, int monthsToPay, int interest, int payment) {

    System.out.println("Car: "+carName);
    System.out.println("Loan: "+loan);
    System.out.println("The length of loan (in months) : "+ monthsToPay);
    System.out.println("The interest per month: "+interest);
    System.out.println("You must pay the payment: "+payment);

    carLoan = loan;
    loanLength = monthsToPay;
    interestRate = interest;
    downPayment = payment;
  }

  // method
  // calculate remaining balance 
  public int calculateRemainingBalance() {
    int remainingBalance = carLoan-downPayment;
    return remainingBalance;
  }

  public int calculateMonthlyBalance() {
    int remainingBalance = calculateRemainingBalance();
    int monthlyBalance = remainingBalance/loanLength;
    return monthlyBalance;
  }

  public int calculateInterest() {
    int monthlyBalance = calculateMonthlyBalance();
    int interest = (monthlyBalance*interestRate)/100;
    return interest;
  }


  public int calculateMonthlyPayment() {
    int monthlyPayment = 0;

    if (loanLength <= 0 || interestRate <=0) {
      System.out.println("Invalid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {
      int monthlyBalance = calculateMonthlyBalance();
      int interest = calculateInterest();
      monthlyPayment = monthlyBalance+interest;
      return monthlyPayment;
    }

    return -1;
  }

  public static void main(String[] args) {
    CarLoan cx5 = new CarLoan("CX5", 10000, 3, 5, 2000);
    int monthlyPayment = cx5.calculateMonthlyPayment();
    System.out.println("The payment per month: "+monthlyPayment);
  }
}