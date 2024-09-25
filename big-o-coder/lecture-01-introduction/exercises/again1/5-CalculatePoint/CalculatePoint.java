import java.util.Scanner;

public class CalculatePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int benNumber = sc.nextInt();
        
        sum += benNumber % 10;
        benNumber /= 10;

        sum += benNumber % 10;
        benNumber /= 10;

        sum += benNumber % 10;
        benNumber /= 10;

        sum += benNumber % 10;
        benNumber /= 10;

        sum += benNumber % 10;
        benNumber /= 10;

        sum += benNumber % 10;
        benNumber /= 10;

        int result = sum % 10;

        System.out.println(result);
    }
}