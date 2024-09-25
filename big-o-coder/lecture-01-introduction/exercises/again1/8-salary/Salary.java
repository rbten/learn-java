import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double a = sc.nextDouble();
        int t = sc.nextInt();

        double luong = x * a + t;

        System.out.printf("%.2f", luong);
    }
}
