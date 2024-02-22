public class PlusAndMinus {
    public static void main(String[] args) {
        double balance = 20000.99;
        System.out.println(balance);

        double depositAmount = 1000.0;
        balance += depositAmount;
        System.out.println(balance);

        double withdrawAmount = 500;
        balance -= withdrawAmount;
        System.out.println(balance);

        int numPicturesOfCats = 60 + 24;
        System.out.println("Number pictures of cats: " + numPicturesOfCats);

        // take a picture
        numPicturesOfCats++;
        System.out.println("Take a picture: " + numPicturesOfCats);

        // delete a picture
        numPicturesOfCats--;
        System.out.println("Delete a picture: " + numPicturesOfCats);


        int zebrasInZoo = 8;
        System.out.println("Zebras in zoo: " + zebrasInZoo);

        int giraffesInZoo = 4;
        System.out.println("Giraffes in zoo: " + giraffesInZoo);

        int animalsInZoo = zebrasInZoo + giraffesInZoo;
        System.out.println("Animals in zoo: " + animalsInZoo);

        int numZebraAfterTrade = zebrasInZoo - 2;
        System.out.println("Number zebra after trade in zoo: " + numZebraAfterTrade);

        int updateAnimalsInZoo = numZebraAfterTrade + giraffesInZoo;
        System.out.println("Animals in zoo: " + updateAnimalsInZoo);
    }
}