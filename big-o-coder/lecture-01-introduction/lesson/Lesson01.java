import java.util.Scanner;

public class Lesson01 {
    public static void main(String[] args) {
        System.out.println("\nprint:");
        System.out.println("Hello world!!!");
        System.out.println(3);
        System.out.println(3.14);
        System.out.println(4E3);

        /*
        build program
        1. problem
        2. algorithm
        3. source code
        4. test and fix bug
        5. package and deploy
         */ 

        // operator
        System.out.println("\noperator:");
        System.out.println(9 + 2);
        System.out.println(9 - 2);
        System.out.println(9 * 2);
        System.out.println(1.0 * 9 / 2);
        System.out.println(9 % 2);
        System.out.println(9.0 % 2.0);
        System.out.println(9 / 2);
        System.out.println(10 * (2 + 3) - 3);

        //variable
        System.out.println("\nvariable:");
        int t;
        t = 9 + 2;
        System.out.println(t);

        int thisYear;
        thisYear = 2024;
        int yearOfBirth;
        yearOfBirth = 1997;
        int myAge;
        myAge = thisYear - yearOfBirth;
        System.out.println(myAge);

        //printf, %d, %f
        System.out.println("\nprintf:");
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.printf("%d + %d = %d", a, b, c);

        double x = 3.1415926535;
        System.out.printf("\n%.2f", x);
        
        // input user
        System.out.println();
        System.out.println("The Integer Reader");
        int numA, numB;


        Scanner sc = new Scanner(System.in);
        numA = sc.nextInt();
        numB = sc.nextInt();

        System.out.printf("numA: %d", numA);
        System.out.println();
        System.out.printf("numB: %d", numB);

        System.out.println();
        System.out.println("The Double Reader");

        double numC, numD;
        numC = sc.nextDouble();
        numD = sc.nextDouble();
        
        System.out.printf("numC: %.2f", numC);
        System.out.println();
        System.out.printf("numD: %.2f", numD);
    }
}