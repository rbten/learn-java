public class Magic {
  public static void main(String[] args){
    // myNumber is a original number
    int myNumber = 1000;

    System.out.println("The result is only THREE!");

    System.out.println(makeMagicMath(myNumber));
    System.out.println(makeChallengeCompoundAssignOp(myNumber));
    System.out.println(makeAllInOne(myNumber));
  }

  static int makeMagicMath(int myNumber) {
    int stepOne = myNumber*myNumber;
    int stepTwo = stepOne+myNumber;
    int stepThree = stepTwo/myNumber;
    int stepFour = stepThree+17;
    int stepFive = stepFour-myNumber;
    int stepSix = stepFive/6;

    return stepSix;
  }

  static int makeChallengeCompoundAssignOp(int myNumber) {
    int magicNumber = myNumber*myNumber;
    magicNumber += myNumber;
    magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;

    return magicNumber;
  }

  static int makeAllInOne(int myNumber) {
    int magicNumber = ((myNumber*myNumber+myNumber)/myNumber+17-myNumber)/6;

    return magicNumber;
  }
}