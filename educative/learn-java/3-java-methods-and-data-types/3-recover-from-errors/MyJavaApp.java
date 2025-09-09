import java.util.Scanner;

public class MyJavaApp {
    public static int calculateRecArea(int length, int width) {
        int recArea = length * width;
        return recArea;
    }

    public static void main(String[] args) {
        // bugs
        // syntax
        // logical

        // scope
        // the order of statements
        // the order of parameters, arguments in method

        Scanner scan = new Scanner(System.in);

        // String firstName = "";
        // String lastName = "";
        // String fullName = "";

        // System.out.print("Enter you first Name: ");
        // firstName = scan.nextLine();
        // System.out.print("Enter you last Name: ");
        // lastName = scan.nextLine();

        // fullName = firstName + " " + lastName;

        // System.out.println("Hi there, " + fullName);

        // calculate rectangle area
        System.out.println("Calculate the area of rectangle");
        System.out.print("Length: ");
        int lengthRec = scan.nextInt();
        System.out.print("Width: ");
        int widthRec = scan.nextInt();
        
        int areaRec = lengthRec * widthRec;
        System.out.println("Area: " + areaRec);
        
    }
}