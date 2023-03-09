public class OptionOneStaticMethods{
  public static void main(String[] args) {
    // return smaller number
    int smallerNumber = Math.min(3, 10);
    System.out.println(smallerNumber);

    // return absolute value of a value
    System.out.println(Math.abs(5));
    System.out.println(Math.abs(-5));

    // return how many times a double number should be multiplied by itself
    double powOfNumber = Math.pow(5, 3);
    System.out.println(powOfNumber);

    // return the square root of a double number
    double sqrtOfNumberA = Math.sqrt(49);
    System.out.println(sqrtOfNumberA);
    double sqrtOfNumberB = Math.sqrt(52);
    System.out.println(sqrtOfNumberB);

    // return random number between 0.0 and 1.0
    System.out.println(Math.random());
    // return random number between 0.0 and 10 => [0, 9] (line: 28)
    System.out.println(Math.random() * 10);

    // return random number between 10 and 20 => [10, 20]
    // (Math.random() * (maxValue - minValue + 1)) + minValue.
    // (Math.random() * steps) + startPosition.
    System.out.println(Math.random() * 20) + 10;
    
  }
}