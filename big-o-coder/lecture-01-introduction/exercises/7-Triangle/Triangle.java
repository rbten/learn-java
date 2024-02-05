import java.util.Scanner;
import java.lang.Math;

public class Triangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double a, b, c, chuVi, dienTich, nuaChuVi;
    
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    
    chuVi = a + b + c;
    nuaChuVi = (chuVi / 2) * 1.0;
    dienTich = Math.sqrt(nuaChuVi * (nuaChuVi - a) * (nuaChuVi - b) * (nuaChuVi - c));
    
    System.out.printf("%.2f %.2f", chuVi, dienTich);
  }
}