/*
* My calculator program can do:
* First, you need create an object:
  * Create an object => Calculator anObject = new Calculator();
  
* There are 5 functions:
* Add two numbers (A + B = result):
  * Apply .add(numA, numB) method => anObject.add(1, 1);
  * See result: System.out.println(anObject.add(1, 1));
  * Expected result: 2

* Subtract number B from number A (A - B = result):
  * Apply .subtract(numA, numB) method => anObject.subtract(2, 1);
  * See result: System.out.println(anObject.subtract(2, 1));
  * Expected result: 1

* Multiply two numbers (A * B = result):
  * Apply .multiply(numA, numB) method => anObject.multiply(2, 3);
  * See result: System.out.println(anObject.multiply(2, 3));
  * Expected result: 6

* Divide number A by number B (A / B = result):
  * Apply .divide(numA, numB) method => anObject.divide(4, 2);
  * See result: System.out.println(anObject.multiply(4, 2));
  * Expected result: 2.0

* Get a remainder of numA divided by numB (A % B = result):
  * Apply .modulo(numA, numB) method => anObject.modulo(5, 2);
  * See result: System.out.println(anObject.modulo(5, 2));
  * Expected result: 1.0
*/

public class Calculator {
  public Calculator() {

  }

  public int add(int numA, int numB) {
    int sumOfTwoNumbers = numA+numB;
    return sumOfTwoNumbers;
  }

  public int subtract(int numA, int numB) {
    int differenceOfTwoNumbers = numA-numB;
    return differenceOfTwoNumbers;
  }

  public int multiply(int numA, int numB) {
    int productOfTwoNumbers = numA*numB;
    return productOfTwoNumbers;
  }

  public double divide(int numA, int numB) {
    double divisionOfTwoNumbers = numA/numB;
    return divisionOfTwoNumbers;
  }

  public double modulo(int numA, int numB) {
    double remainderOfDivision = numA%numB;
    return remainderOfDivision;
  }

  public static void main (String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(1, 1));
    System.out.println(myCalculator.subtract(2, 1));
    System.out.println(myCalculator.multiply(2, 3));
    System.out.println(myCalculator.divide(4, 2));
    System.out.println(myCalculator.modulo(5, 2));
  }
}