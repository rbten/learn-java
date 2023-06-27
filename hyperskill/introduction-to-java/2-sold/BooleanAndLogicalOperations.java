public class BooleanAndLogicalOperations {
    
    public static void main(String[] args) {
        boolean open = true;
        boolean closed = false;

        System.out.println(open);   // true
        System.out.println(closed); // false

        boolean f = false; // f is false
        boolean t = !f;    // t is true 

        boolean b1 = false && false; // false
        boolean b2 = false && true;  // false
        boolean b3 = true && false;  // false
        boolean b4 = true && true;   // true 
    }
}