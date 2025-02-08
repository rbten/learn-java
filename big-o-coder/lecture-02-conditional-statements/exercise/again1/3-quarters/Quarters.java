import java.util.Scanner;

public class Quarters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if (month == 1 || month == 2 || month == 3) {
            System.out.println("1");
        } else if (month == 4 || month == 5 || month == 6) {
            System.out.println("2");
        } else if (month == 7 || month == 8 || month == 9) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}