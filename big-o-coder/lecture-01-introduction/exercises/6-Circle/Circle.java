import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();
        float PI = 3.14f;
        float P = 2 * radius *PI;
        float S = radius * radius * PI;

        System.out.printf("%.2f\n", P);
        System.out.printf("%.2f", S);
    }
}