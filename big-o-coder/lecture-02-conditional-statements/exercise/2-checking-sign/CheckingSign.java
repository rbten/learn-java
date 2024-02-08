import java.util.Scanner;

public class CheckingSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a * b > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}