import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float banKinh = sc.nextFloat();
        float PI = 3.14f;

        float chuVi = banKinh * 2 * PI;
        float dienTich = banKinh * banKinh * PI;

        System.out.printf("%.2f", chuVi);
        System.out.println();
        System.out.printf("%.2f",dienTich);
    }
}