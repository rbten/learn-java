import static java.lang.Math.*;

public class Number {
    public static void main(String[] args) {
        int smallerNumber = Math.min(3, 10);
        System.out.println(smallerNumber);

        // import static java.lang.Math.*
        int smallerNumberEx2 = min(5, 7);
        System.out.println(smallerNumberEx2);


        System.out.println(Math.abs(-5));
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5.0));
        System.out.println(Math.abs(5.0));


        System.out.println(Math.pow(5, 3));


        System.out.println(Math.sqrt(49));
        System.out.println(Math.sqrt(52));

        
        // [0.0 -> 1.0)
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());


        // [0.0 -> 9]
        System.out.println(Math.random() * 10);


        // because random() return double value
        int b = (int)(Math.random() * 10);
        System.out.println(b);
    
        // (Math.random() * (maxValue - minValue + 1)) + minValue
        // [1 -> 10]
        System.out.println(Math.random() * (10)+1);
    }
}