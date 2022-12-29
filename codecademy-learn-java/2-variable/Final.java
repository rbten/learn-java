public class Final {
  public static void main(String[] args) {
    final double pi = 3.14;
    System.out.println(pi);

    //Cause error: cannot assign a value to final variable pi
    /*
    pi = 3.15;
    System.out.println(pi);
    */
    
  }
}