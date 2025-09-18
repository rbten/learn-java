import java.util.Scanner;
import java.util.Random;

public class MyJavaApp {

// METHOD ZONE

    public static void printWelcomeMessage(String userName) {
        String welcomeMessage = "Hi, " + userName + "! Welcome to the math quiz.";
        System.out.println(welcomeMessage);
    }

    public static String chooseOperator(int opNum) {
        if (opNum == 1) {
            return "+";
        } else if (opNum == 2) {
            return "-";
        } else if (opNum == 3) {
            return "*";
        }

        return "/";
    }

    public static int calculateAnswer(int num1, int num2, String op) {
        if (op == "+") {
            return num1 + num2;
        } else if (op == "-") {
            return num1 - num2;
        } else if (op == "*") {
            return num1 * num2;
        } else if (op == "/") {
            return (int)(num1 / num2);
        }

        return -1;
    }

    public static void printQuestion(int num1, int num2, String op) {
        String question = num1 + " " + op + " " + num2 + ": ";
        System.out.print(question);
    }
    
    public static void printFarewellMessage(String userName) {
        String aMessage = "Thanks for taking the quiz, " + userName;
        System.out.println(aMessage);
    }


// MAIN STRUCTURE

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();


        // Variables
        String userName = "";
        int num1 = 0;
        int num2 = 0;
        int opNum = 0;
        String op = "";
        int userAnswer = 0;
        int correctAnswer = 0;
        int score = 0;
        int totalQuestions = 0;


        // User's name
        System.out.print("Your name: ");
        userName = scan.nextLine();
        printWelcomeMessage(userName);

        System.out.print("The number of questions: ");
        int numberQuestions = scan.nextInt();

        while(totalQuestions < numberQuestions) {
            num1 = random.nextInt(10) + 1;
            num2 = random.nextInt(10) + 1;

            opNum = random.nextInt(4) + 1;
            op = chooseOperator(opNum);

            printQuestion(num1, num2, op);
            userAnswer = scan.nextInt();

            correctAnswer = calculateAnswer(num1, num2, op);

            if (userAnswer == correctAnswer) {
                score += 1;
                System.out.println("=> Correct");
            } else {
                System.out.println("=> Wrong");
                System.out.println("=> The correct answer: " + correctAnswer);
            }

            totalQuestions++;
        }

        System.out.println("Score: " + score + "/" + numberQuestions);

        printFarewellMessage(userName);
    }
}