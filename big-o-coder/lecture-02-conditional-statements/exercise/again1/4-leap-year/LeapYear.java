import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearInput = sc.nextInt();

        if ((yearInput % 400) == 0) {
            System.out.println("YES");
        } else if ((yearInput % 4) == 0 && (yearInput % 100) != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}