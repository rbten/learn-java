import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basicSalary = sc.nextInt();
        double coefficientsSalary = sc.nextDouble();
        int allowance = sc.nextInt();

        double salaryOfEmployee = basicSalary * coefficientsSalary + allowance;

        System.out.printf("%.2f", salaryOfEmployee);
    }
}