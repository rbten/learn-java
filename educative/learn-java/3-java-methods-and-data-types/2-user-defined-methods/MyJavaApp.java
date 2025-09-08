import java.util.Scanner;

public class MyJavaApp {
    // Let’s order another pizza
    // public static String orderPizza(String pizzaType, String extraTopping) {
    //     String pizza = "Make a " + pizzaType + " pizza with " + extraTopping + ".";
    //     return pizza;
    // }


    // Practice makes a perfect method
    // public static int addNumbers(int num1, int num2) {
    //     int sumResult = num1 + num2;
    //     return sumResult;
    // }

    public static void printQuestion(int num1, String op, int num2) {
        String question = "What is " + num1 + " " + op + " "  + num2 + "? ";
        System.out.print(question);
    }

    public static void answerFeedback(int userAnswer, int correctAnswer) {
        System.out.println("Your answer is: " + userAnswer);
        System.out.println("The correct answer is: " + correctAnswer);
        System.out.println();
    }

    public static void main(String[] args) {
        // Let’s order another pizza
        // String firstPizza = orderPizza("Cheese", "Nothing");
        // System.out.println(firstPizza);

        // String secondPizza = orderPizza("Ocean", "Pineapple");
        // System.out.println(secondPizza);


        // Add two numbers method
        // int sumResult = addNumbers(32, 12);
        // System.out.println(sumResult);

        Scanner scan = new Scanner(System.in);

        int n1 = 6;
        int n2 = 7;

        printQuestion(n1, "+", n2);
        int userAnswer = scan.nextInt();
        int correctAnswer = n1 + n2;
        answerFeedback(userAnswer, correctAnswer);

        printQuestion(n1, "-", n2);
        userAnswer = scan.nextInt();
        correctAnswer = n1 - n2;
        answerFeedback(userAnswer, correctAnswer);

        printQuestion(n1, "*", n2);
        userAnswer = scan.nextInt();
        correctAnswer = n1 * n2;
        answerFeedback(userAnswer, correctAnswer);

        printQuestion(n1, "/", n2);
        userAnswer = scan.nextInt();
        correctAnswer = (int)(n1 / n2);
        answerFeedback(userAnswer, correctAnswer);
    }
}