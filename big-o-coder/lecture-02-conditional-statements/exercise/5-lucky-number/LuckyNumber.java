import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aUpan = sc.nextInt();
        int bIpan = sc.nextInt();
        int xBut = sc.nextInt();

        if ((xBut % aUpan) == 0 && (xBut % bIpan) == 0) {
            System.out.println("Bothh");
        } else if ((xBut % aUpan) == 0) {
            System.out.println("Upan");
        } else if ((xBut % bIpan) == 0) {
            System.out.println("Ipan");
        } else {
            System.out.println("No");
        }
    }
}