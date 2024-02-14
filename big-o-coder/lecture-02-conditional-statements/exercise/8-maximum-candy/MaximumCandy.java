import java.util.Scanner;

public class MaximumCandy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tuiA= sc.nextInt();
        int tuiB= sc.nextInt();
        int tuiC= sc.nextInt();
        int tuiD= sc.nextInt();

        int tuiNhieuKeo = tuiA;

        if (tuiB > tuiNhieuKeo) {
            tuiNhieuKeo = tuiB;
        }

        if (tuiC > tuiNhieuKeo) {
            tuiNhieuKeo = tuiC;
        }

        if (tuiD > tuiNhieuKeo) {
            tuiNhieuKeo = tuiD;
        }

        System.out.println(tuiNhieuKeo);
    }
}