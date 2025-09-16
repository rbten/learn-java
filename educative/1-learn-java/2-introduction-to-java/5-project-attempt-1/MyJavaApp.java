import java.util.Scanner;

public class MyJavaApp {
    public static void main(String[] args) {

        // ask user's name
        System.out.print("Your name: ");

        // save to variable
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();

        // print welcome message
        System.out.println("Welcome to the math quiz, " + userName + "!");

        // print 5 math questions and save to variable

        // Make 5 questions
        String questionOne = "1 + 1 = ";
        String questionTwo = "3 + 2 = ";
        String questionThree = "7 + 4 = ";
        String questionFour = "15 + 17 = ";
        String questionFive = "21 + 25 = ";
        String userQuestionOne, userQuestionTwo, userQuestionThree, userQuestionFour, userQuestionFive;

        System.out.print(questionOne);
        userQuestionOne = scan.nextLine();
        System.out.print(questionTwo);
        userQuestionTwo = scan.nextLine();
        System.out.print(questionThree);
        userQuestionThree = scan.nextLine();
        System.out.print(questionFour);
        userQuestionFour = scan.nextLine();
        System.out.print(questionFive);
        userQuestionFive = scan.nextLine();

        // print farewell message
        System.out.println("We got your answers!");
        System.out.println("Have fun, " + userName + "!");
    }
}