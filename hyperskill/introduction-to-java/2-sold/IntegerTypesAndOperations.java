import java.util.Scanner;

public class IntegerTypesAndOperations {

    public static void main(String[] args) {
        int million = 1_000_000;
        System.out.println(million + 1);

        long one = 1L;
        long twentyTwo = 22L;
        long bigNumber = 100_000_000_000L;

        long result = bigNumber + twentyTwo - one;
        System.out.println(result);

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
}