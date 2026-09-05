public class UsingStringMethods {
    public static void main(String[] args) {
        String fruit = "Banana";

        int length = fruit.length();
        System.out.println("The length of the " + fruit + " is: " + length);

        char letter = fruit.charAt(1);
        System.out.println("The character at index 1 is: " + letter);

        String partFrom1To4 = fruit.substring(1, 4);
        String partFrom4To5 = fruit.substring(4, 6);
        System.out.println("The substring from index 1 to 4 is: " + partFrom1To4);
        System.out.println("The substring from index 4 to 5 is: " + partFrom4To5);

        String text = "subscription";
        String extractedText = text.substring(3, 9);
        System.out.println("Output: " + extractedText);

        String fruit1 = "Banana";
        String fruit2 = "banana";
        String fruit3 = "Banana";
        boolean result1 = fruit1.equals(fruit2);
        boolean result2 = fruit1.equals(fruit3);
        System.out.println("Using equals() method \"" + fruit1 + "\" is equal to \"" + fruit2 + "\": " + result1);
        System.out.println("Using equals() method \"" + fruit1 + "\" is equal to \"" + fruit3 + "\": " + result2);

        String fruitInUpperCase = fruit.toUpperCase();
        String fruitInLowerCase = fruit.toLowerCase();
        System.out.println("The fruit converted to uppercase: \"" + fruitInUpperCase + "\"");
        System.out.println("The fruit converted to lowercase: \"" + fruitInLowerCase + "\"");
        
    } 
}