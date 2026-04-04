class ArithmeticOperators {
    public static void main(String[] args) {
        int var1 = 9;
        int var2 = 2;

        System.out.println(var1 + var2);
        System.out.println(var1 - var2);
        System.out.println(var1 * var2);
        System.out.println(var1 / var2);
        System.out.println(var1 % var2);

        // double type
        double var3 = 9.5;
        double var4 = 2.0;

        System.out.println(var3 + var4);
        System.out.println(var3 - var4);
        System.out.println(var3 * var4);
        System.out.println(var3 / var4);
        System.out.println(var3 % var4);

        // compound expressions
        int result = 9 + (3 - 6) / 2 * 5 % 4;
        System.out.println(result);
    }
}