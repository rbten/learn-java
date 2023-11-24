public class Pets` {
    public static void main(String[] args) {
        String[] pets = {"Milo", "Lulu", "Corki"};

        int lengthOfPets = pets.length;

        java.util.Random randomGenerator = new java.util.Random();
        int randomPets = randomGenerator.nextInt(lengthOfPets);

        String phrase = pets[randomPets] + " is a dog";

        System.out.println(phrase);
    }
}