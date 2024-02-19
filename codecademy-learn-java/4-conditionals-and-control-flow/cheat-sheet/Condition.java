public class Condition {
    public static void main(String[] args) {
        // else Statement
        // boolean condition1 = false;

        // if (condition1) {
        //     System.out.println("condition1 is true");
        // }
        // else {
        //     System.out.println("condition1 is not true");
        // }
        // // Prints: condition1 is not true



        // else if Statements
        // int testScore = 76;
        // char grade;

        // if (testScore >= 90) {
        //     grade = 'A';
        // } else if (testScore >= 80) {
        //     grade = 'B';
        // } else if (testScore >= 70) {
        //     grade = 'C';
        // } else if (testScore >= 60) {
        //     grade = 'D';
        // } else {
        //     grade = 'F';
        // }

        // System.out.println("Grade: " + grade);



        // Nested Conditional Statements
        // boolean studied = true;
        // boolean wellRested = true;

        // if (wellRested) {
        //     System.out.println("Best of luck today!");
        //     if (studied) {
        //         System.out.println("You are prepared for exam!");
        //     } else {
        //         System.out.println("Study before your exam!");
        //     }
        // } 


        // NOT operator
        boolean a = true;
        System.out.println(!a);
        System.out.println(!false); 

        // AND operator
        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("false && false: " + (false && false));

        // OR operator
        System.out.println("true || true: " + (true || true));
        System.out.println("true || false: " + (true || false));
        System.out.println("false && true: " + (false || true));
        System.out.println("false && false: " + (false || false));

    }
}