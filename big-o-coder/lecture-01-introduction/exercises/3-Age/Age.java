import java.util.Scanner;

public class Age{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int birthYear = sc.nextInt();

        int ageTo2019 = 2019 - birthYear;

        System.out.println(ageTo2019);
    }
}