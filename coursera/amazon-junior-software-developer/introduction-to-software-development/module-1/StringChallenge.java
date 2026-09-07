public class StringChallenge {
    public static void main(String args[]) {
        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";

        String fullName = firstName + lastName;

        String username = fullName.toLowerCase();
        System.out.println("'username' after conversion and concatenation: " + username);

        String correctEmail = email.replace("example", "gmail");
        System.out.println("'email' after replacing example.com with gmail.com: " + correctEmail);

        int findAt = email.indexOf('@');
        System.out.println("index of @ in the email address is: " + findAt);
    }
}