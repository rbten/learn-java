import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float chuVi = a + b + c;
        float nuaChuVi = chuVi / 2;

        double dienTich = Math.sqrt(nuaChuVi * (nuaChuVi - a) * (nuaChuVi - b) * (nuaChuVi - c));

        System.out.printf("%.2f ", chuVi);
        System.out.printf("%.2f", dienTich);
    }
}