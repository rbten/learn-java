public class StringCheatSheet {
    public static void main(String[] args) {
        String userName = "RobertTen";

        String greetOne = "Hi ";

        System.out.println("User name: " + userName);
        System.out.println("RobertTen's length: " + userName.length());

        System.out.println("Index of \"T\": " + userName.indexOf("T"));
        System.out.println("Index of \"b\": " + userName.indexOf("b"));

        System.out.println(greetOne.concat(userName));
        System.out.println("Equals ignore case \"robertten\": " + userName.equalsIgnoreCase("robertten"));

        System.out.println("charAt(4): " + userName.charAt(4));


        System.out.println(userName.substring(6));
        // [6, 9)
        System.out.println(userName.substring(6, 9));
    }
}