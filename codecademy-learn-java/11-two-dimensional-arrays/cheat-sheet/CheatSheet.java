public class CheatSheet {
    public static void main(String[] args) {
        // nested iteration statements
        for(int outer = 0; outer < 3; outer++) {
            System.out.println("The outer index is: " + outer);
            for(int inner = 0 ; inner < 4; inner++) {
                System.out.println("\tThe inner index is: " + inner);
            }
        }

        int[][] twoDIntArray;
        String[][] twoDStringArray;
        int[][] twoDDoubleArray;

        int [][] arr = {{1, 2, 3},
                        {4, 5, 6}};

        int retrieved = arr[1][0];

        System.out.println(retrieved);
    }
}