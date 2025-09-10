 import java.util.Scanner;
 import java.util.Random;

 public class MyJavaApp {

    public static void printWelcomeMessage(String userName) {
        String welcomeMessage = "Welcome to the math quiz, " + userName + "!";
        System.out.println(welcomeMessage);
    }

    public static void printFarewellMessage(String userName) {
        String farewellMessage = "Thanks for taking the quiz, " + userName + "!";
        System.out.println(farewellMessage);
    }

    public static void printQuestion(int num1, int num2, String op) {
        String question = num1 + " + " + num2 + ": ";
        System.out.print(question);
    }

    public static void printFeedbackAnswer(int correctAnswer) {
        System.out.println("The correct answer: " + correctAnswer);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Adding 1 to ensure range 1-10
        // random.nextInt(10) generates number from 0-9
        // int randomNumber = random.nextInt(10) + 1;

        // System.out.println(randomNumber);

        int num1;
        int num2;
        int userAnswer;
        int correctAnswer;
        String userName;

        // Ask user's name
        System.out.print("Please enter your name: ");
        userName = scan.nextLine();

        // Print welcome message
        printWelcomeMessage(userName);


        // Make 5 questions
        
        // Question 1
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        printQuestion(num1, num2, "+");

        userAnswer = scan.nextInt();
        correctAnswer = num1 + num2;
        printFeedbackAnswer(correctAnswer);

        System.out.println();

        // Question 2
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        printQuestion(num1, num2, "-");


        userAnswer = scan.nextInt();
        correctAnswer = num1 - num2;
        printFeedbackAnswer(correctAnswer);

        System.out.println();


        // Question 3
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        printQuestion(num1, num2, "*");

        userAnswer = scan.nextInt();
        correctAnswer = num1 * num2;
        printFeedbackAnswer(correctAnswer);

        System.out.println();

        // Question 4
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        printQuestion(num1, num2, "/");


        userAnswer = scan.nextInt();
        correctAnswer = num1 / num2;
        printFeedbackAnswer(correctAnswer);

        System.out.println();

        // Question 5
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        printQuestion(num1, num2, "/");

        userAnswer = scan.nextInt();
        correctAnswer = num1 / num2;
        printFeedbackAnswer(correctAnswer);

        System.out.println();


        // Print farewell message
        printFarewellMessage(userName);

    }
 }