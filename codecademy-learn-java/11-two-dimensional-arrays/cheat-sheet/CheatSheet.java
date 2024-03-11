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

        double[][] doubleValues = {
                                    {1.5, 2.6, 3.7},
                                    {7.5, 6.4, 5.3},
                                    {9.8,  8.7, 7.6},
                                    {3.6, 5.7, 7.8}
                                    };

        String[][] stringValues;
        stringValues = new String[][] {
            {"working", "with"},
            {"2D", "arrays"},
            {"is", "fun"}
        };

        System.out.println(doubleValues[2][0]);
        System.out.println(stringValues[2][1]);
        
        doubleValues[2][0] = 1000.0;
        System.out.println(doubleValues[2][0]);

        for(int i = 0; i < stringValues.length; i++) {
            for (int j = 0; j < stringValues[0].length; j++) {
                System.out.println(stringValues[i][j]);
            }
        }

        for(int i = 0; i < stringValues[0].length; i++) {
            for (int j = 0; j < stringValues.length; j++) {
                System.out.println(stringValues[j][i]);
            }
        }
        
        for(String[] rowofStrings : stringValues) {
            for (String a : rowofStrings) {
                System.out.println(a);
            }
        }
    }
}