import java.util.Scanner;

public class L09 {
  // factorials
  // public static int f(int n) {
  //   if(n >= 1) {
  //     return n * f(n - 1);
  //   } else {
  //     return 1;
  //   }
  // }

  // Fibonacci
  public static int fibonacci(int n) {
    if(n >= 3) {
      return fibonacci(n - 1) + fibonacci(n - 2);
    } else {
      return 1;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int ketQua = f(4);

    System.out.println(ketQua);

  }
}