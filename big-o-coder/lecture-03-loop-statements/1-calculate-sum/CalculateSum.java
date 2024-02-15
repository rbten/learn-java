import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputUser = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= inputUser; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}