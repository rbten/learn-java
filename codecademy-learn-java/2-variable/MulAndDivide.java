public class MulAndDivide {
  public static void main(String[] args) {
    learnMultiplication();
    learnDivision();
    learnIntegerDivision();
    learnMulAndDivide();
  }

  static void learnMultiplication() {
    /*
      Multiplication:

      hoursWorked = 40
      hourlyRate = 15.50
      paycheck = ?
    */
    double hoursWorked = 40;
    double hourlyRate = 15.50;
    double paycheckAmount = hoursWorked*hourlyRate;
    System.out.println("Paycheck: "+paycheckAmount);
  }

  static void learnDivision() {
    /*
      Division:

      balance = 20010.5
      hourlyRate = 15.5
      hoursWorkedB = ?
    */
    double balance = 20010.5;
    double hourlyRate = 15.50;
    double hoursWorkedB = balance/hourlyRate;
    System.out.println("We worked: "+hoursWorkedB+ " hours");
  }

  static void learnIntegerDivision() {
    int evenlyDivided = 10/5;
    //evenlyDivided holds 2, because 10 divided by 5 is 2
    int unevenlyDivided = 10/4;
    //unevenlyDivided holds 2, because 10 divided by 4 is 2.5 => floor
    System.out.println("evenlyDivided: "+evenlyDivided);
    System.out.println("unevenlyDivided: "+unevenlyDivided);
  }

  static void learnMulAndDivide() {
    double subtotal = 30;
    double tax = 0.0875;

    //Calculate total
    double total = subtotal + (subtotal*tax);
    System.out.println("Total: "+total);

    //Split the cost for 4 people
    double perPerson = total/4;
    System.out.println("perPerson: "+perPerson);
  }
}