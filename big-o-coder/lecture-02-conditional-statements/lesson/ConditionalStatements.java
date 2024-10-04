import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // In gia tri lon nhat cua hai so
        System.out.println("Tim so lon hon: ");
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        if (numA > numB) {
            System.out.println(numA);
        } else {
            System.out.println(numB);
        }

        // Xet so nguyen co dau
        System.out.println("");
        System.out.println("Xet so nguyen co dau: ");
        int numN = sc.nextInt();
        if (numN > 0) {
            System.out.println("Positive number");
        } else if (numN == 0) {
            System.out.println("Zero number");
        } else {
            System.out.println("Negative number");
        }

        // Boolean expression
        System.out.println("");
        System.out.println("Boolean Expression: ");
        int a = 10;
        int b = 2;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a % 2 == b);

        

    }
}