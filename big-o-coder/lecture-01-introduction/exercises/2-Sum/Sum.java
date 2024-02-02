import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        int tong = a + b;

        System.out.printf("%d + %d = %d", a, b, tong);
    }
}
