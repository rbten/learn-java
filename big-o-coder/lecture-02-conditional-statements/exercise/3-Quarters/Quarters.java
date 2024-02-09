import java.util.Scanner;

public class Quarters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int monthInput = sc.nextInt();

        if (monthInput == 1 || monthInput == 2 || monthInput == 3) {
            System.out.println("1");
        } else if (monthInput == 4 || monthInput == 5 || monthInput == 6) {
            System.out.println("2");
        } else if (monthInput == 7 || monthInput == 8 || monthInput == 9) {
            System.out.println("3");
        } else if (monthInput == 10 || monthInput == 11 || monthInput == 12) {
            System.out.println("4");
        }
    }
}