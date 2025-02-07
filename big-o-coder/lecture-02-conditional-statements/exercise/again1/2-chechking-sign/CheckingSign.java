import java.util.Scanner;

public class CheckingSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        if (a * b > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}