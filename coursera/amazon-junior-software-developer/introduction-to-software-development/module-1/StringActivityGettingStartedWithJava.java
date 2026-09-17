public class StringActivityGettingStartedWithJava {
    public static void main(String[] args) {

        String firstName = "Robert";        
        String lastName = "Huynh";        
        String movieTitle = "The Little Effort";
        int numberOfTicket = 100;
        double pricePerTicket = 9.99;

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Number of Tickets: " + numberOfTicket);
        System.out.println("Price per ticket in USD: " + pricePerTicket);

        double totalPrice = numberOfTicket * pricePerTicket;
        System.out.println("Total Price of " + numberOfTicket + " tickets: " + totalPrice);

        String username = (firstName + lastName).toLowerCase();
        System.out.println("Username: " + username);

        String movieName = movieTitle.toUpperCase();
        System.out.println("Updated movie name: " + movieName);
        System.out.println("Congratulations!! You have successfully booked the tickets\n");
        System.out.println("Username: " + username);
        System.out.println("Movie: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTicket);
        System.out.println("Price per ticket: $" + pricePerTicket);
        System.out.println("Total price of " + numberOfTicket + " tickets: $" + totalPrice);
        System.out.println("Thank you for choosing us for booking your movie tickets\n");
        System.out.println("Enjoy your movie!!");

        
    }
}