import java.util.Scanner;
import java.util.Random;

public class MyJavaApp {
    
    // Method to greet the user
    public static void greetUser(String userName) {
        String welcomeMessage = "Hi, " + userName + "! Welcome to the math quiz.";
        System.out.println(welcomeMessage);
    }

    // Method to choose the operator based on the random choice integer generated
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

    // Method to perform the required operation and calculate the correct answer
    public static int calculateAnswer(int n1, int n2, String op) {
        if (op == "+") {

            return n1 + n2;

        } else if (op == "-") {

            return n1 - n2;

        } else if (op == "*") {

            return n1 * n2;

        } else if (op == "/") {

            return (int)(n1/n2);

        } else {

            return -1;
        }
    }
    
    // Method to print question in the correct format
    public static void printQuestion(int num1, int num2, String op) {
        String question = num1 + " " + op + " " + num2 + ": ";
        System.out.print(question);
    }

    // method to bid farewell to the user and give them the result
    public static void printFarewellMessage (String userName) {
        String farewellMessage = "Thanks for taking the quiz, " + userName + "!";
        System.out.println(farewellMessage);
    }


// MAIN STRUCTURE

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();


        int num1 = 0;
        int num2 = 0;
        int opNum = 0;
        String op = "";
        int userAnswer = 0;
        int correctAnswer = 0;


        // Take input from the user and save it to a variable
        System.out.print("Your name: ");
        String userName = scan.nextLine();

        // Make a customized greeting for the user and print it
        greetUser(userName);



        // Question 1
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;

        // Choose operator
        opNum = random.nextInt(4) + 1;
        op = chooseOperator(opNum);

        // Print question
        printQuestion(num1, num2, op);
        userAnswer = scan.nextInt();

        // Calculate answer
        correctAnswer = calculateAnswer(num1, num2, op);
        System.out.println("The correct answer: " + correctAnswer);


        // Make a customized farewell message and print it
        printFarewellMessage(userName);

    }
}