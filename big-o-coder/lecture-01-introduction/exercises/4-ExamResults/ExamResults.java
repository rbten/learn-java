import java.util.Scanner;

public class ExamResults {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double math = sc.nextDouble();
        double science = sc.nextDouble();
        double english = sc.nextDouble();

        double sum = math + science + english;

        System.out.printf("%.2f", sum);
    }
}