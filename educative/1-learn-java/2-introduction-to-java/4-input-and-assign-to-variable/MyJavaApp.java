import java.util.Scanner;

public class MyJavaApp {
    public static void main(String[] args) {

        //The method for input
        Scanner scan = new Scanner(System.in);

        //How does the user know what they’re required to input?
        // System.out.println("Please tell us your name: ");
        

        //Where has the user’s input gone?
        // System.out.println("Hi " + scan.nextLine());

        //Variable assignment
        // String userName = "Alex";
        // System.out.println("Hi " + userName + "! Welcome to the math quiz.");
        // System.out.println(userName + ", can you answer the following questions?");
        // System.out.println("Congratulations " + userName + ", on scoring 5 marks!");

        // Exercise
        System.out.print("Your name: ");
        String userName = scan.nextLine();
        System.out.println("Hi " + userName + "! Welcome to the math quiz.");
        System.out.println(userName + ", can you answer the following questions?");
        System.out.println("Congratulations " + userName + ", on scoring 5 marks!");



    }
}

