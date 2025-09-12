import java.util.Scanner;

public class MyJavaApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String greeting;
        System.out.print("Time: ");
        int hour = scan.nextInt();

        if (hour < 12) {
            greeting = "Good Morning, Mate!";
        } else if (hour < 18) {
            greeting = "Good Afternoon, Mate!";
        } else {
            greeting = "Good Evening, Mate!";
        }
        
        System.out.println(greeting);

        int score = 0;

        System.out.print("4 * 7: ");
        int userAnswer = scan.nextInt();
        int correctAnswer = 4 * 7;

        if (userAnswer == correctAnswer) {
            score = score + 1;
            System.out.println("Correct! Your score is: " + score); 
        } else {
            System.out.println("That is not correct answer! Your score is: " + score); 
        }


    }
}