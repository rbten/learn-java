import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Upan, Ipan;
        Upan = sc.nextInt();
        Ipan = sc.nextInt();

        int sum = Upan + Ipan;
        System.out.printf("%d + %d = %d", Upan, Ipan, sum);
    }
}