import java.util.Scanner;

public class MyJavaApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // adding two numbers
        // taking two numbers as input and storing inside two variables respectively

        // System.out.print("First Number: ");
        // int num1 = scan.nextInt();
        // System.out.print("Second Number: ");
        // int num2 = scan.nextInt();

        // int result = num1 + num2;

        // System.out.println("The answer to " + num1 + " + " + num2 + " is " + result);


        // adding arithmetic operations

        // the arithmetic operators in Java

        // int num1 = 7;
        // int num2 = 3;

        // // addition
        // System.out.println("7 + 3 is " + (num1 + num2));

        // // subtraction
        // System.out.println("7 - 3 is " + (num1 - num2));

        // // multiplication
        // System.out.println("7 * 3 is " + (num1 * num2));

        // // division
        // System.out.println("7 / 3 is " + (num1 / num2));


        // printing the user’s answer and the correct answer for different arithmetic operations
        
        
        int num1 = 4;
        int num2 = 9;
        int userAnswer;

        // define questions and answers
        String question1 = "What is " + num1 + " + " + num2 + "? ";
        int ansQuestion1 = 4 + 9;
        String question2 = "What is " + num1 + " - " + num2 + "? ";
        int ansQuestion2 = 4 - 9;
        String question3 = "What is " + num1 + " * " + num2 + "? ";
        int ansQuestion3 = 4 * 9;
        String question4 = "What is " + num1 + " / " + num2 + "? ";
        int ansQuestion4 = 4 / 9;

        // question 1
        System.out.print(question1);
        userAnswer = scan.nextInt();

        System.out.println("Your answer is: " + userAnswer);
        System.out.println("The correct answer is: " + ansQuestion1);
        System.out.println();

        // question 2
        System.out.print(question2);
        userAnswer = scan.nextInt();

        System.out.println("Your answer is: " + userAnswer);
        System.out.println("The correct answer is: " + ansQuestion2);
        System.out.println();

        // question 3
        System.out.print(question3);
        userAnswer = scan.nextInt();

        System.out.println("Your answer is: " + userAnswer);
        System.out.println("The correct answer is: " + ansQuestion3);
        System.out.println();

        // question 4
        System.out.print(question4);
        userAnswer = scan.nextInt();

        System.out.println("Your answer is: " + userAnswer);
        System.out.println("The correct answer is: " + ansQuestion4);



    }
}