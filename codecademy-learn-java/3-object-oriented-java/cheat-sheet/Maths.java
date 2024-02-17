public class Maths {
    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Maths m = new Maths();
        int result = m.sum(10, 20);
        System.out.println("sum is " + result);
    }
}