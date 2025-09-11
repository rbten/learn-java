import java.util.Scanner;

public class MyJavaApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("4 * 7: ");
        int userAnswer = scan.nextInt();
        int correctAnswer = 4 * 7;

        System.out.println("User's answer: " + userAnswer + " Correct answer: " + correctAnswer);
        System.out.println(userAnswer == correctAnswer);
        System.out.println("User's answer: " + userAnswer + " Correct answer: " + correctAnswer);

    }
}
