public class CheatSheet {
    public static void main(String[] args) {
        // nested iteration statements
        for(int outer = 0; outer < 3; outer++) {
            System.out.println("The outer index is: " + outer);
            for(int inner = 0 ; inner < 4; inner++) {
                System.out.println("\tThe inner index is: " + inner);
            }
        }
    }
}