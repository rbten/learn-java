import java.util.Scanner;

public class Lecture10DataAbstraction {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Fraction a;
    Fraction b;

    int temp1, temp2;
    temp1 = sc.nextInt();
    temp2 = sc.nextInt();
    a = new Fraction(temp1, temp2);

    temp1 = sc.nextInt();
    temp2 = sc.nextInt();
    b = new Fraction(temp1, temp2);

    Fraction c = a.sumFraction(b);
    System.out.println(c);
  }
}

class Fraction {
  int num;
  int denom;

  public Fraction sumFraction(Fraction p2) {
    Fraction p3;
    p3 = new Fraction();

    p3.num = this.num*p2.denom + this.denom*p2.num;
    p3.denom = this.denom*p2.denom;

    return p3; 
  }

  public Fraction() {
    this.num = 0;
    this.denom = 1;
  }

  public Fraction(int u) {
    this.num = u;
    this.denom = 1;
  }

  public Fraction(int x, int y) {
    this.num = x;
    this.denom = y;
  }

  public String toString() {
    String s = this.num + "/" + this.denom;
    return s;
  }
}