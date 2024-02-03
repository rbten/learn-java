import java.util.Scanner;

public class CalculatePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sum = 0;

        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;

        System.out.println(sum % 10);
    }
}