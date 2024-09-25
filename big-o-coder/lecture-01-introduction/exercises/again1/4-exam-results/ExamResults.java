import java.util.Scanner;

public class ExamResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float monToan = sc.nextFloat();
        float monKHTN = sc.nextFloat();
        float monAnh = sc.nextFloat();

        float tong = monToan + monKHTN + monAnh;

        System.out.printf("%.2f", tong);
    }
}