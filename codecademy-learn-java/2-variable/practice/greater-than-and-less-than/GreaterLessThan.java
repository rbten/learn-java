public class GreaterLessThan {
    public static void main(String[] args) {
        double balance = 20000.01;
        double amountToWithdraw = 5000.01;

        System.out.println(amountToWithdraw < balance);

        double myBalance = 200.05;
        double costOfBuyingNewLaptop = 1000.05;
        boolean canBuyLaptop = myBalance > costOfBuyingNewLaptop;

        System.out.println("My balance: " + myBalance);
        System.out.println("New laptop: " + costOfBuyingNewLaptop);
        System.out.println("Can buy a new laptop: " + canBuyLaptop);

        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;
        double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
        boolean canGraduate = creditsAfterSeminar > creditsToGraduate;
        
        System.out.println("Can I graduate: " + canGraduate);

    }
}