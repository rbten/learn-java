/**
 * The program Introduction displays a couple of introductory
 * sentences about the reader of this course onto the screen
 */

class Introduction {
    public static void main(String[] args) {
        /*
            Replace Tracy in the quotes below with your name
            Replace 17 with your age
         */

        String name = "Tracy";
        int age = 17;
        // This line prints the introduction on to screen
        System.out.format("My name is %s and I am %d years old. %nI am learning Java.", name, age);
    }
}